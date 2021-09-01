package com.developersmill.projectgrizzly;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import static org.junit.Assert.assertEquals;

public class ResourceControllerTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() {
        server = GrizzlyServer.startServer();
        target = ClientBuilder.newClient().target(GrizzlyServer.BASE_URI);
    }

    @Test
    public void testIt() {
        String responseMsg = target.path("resources").request().get(String.class);
        assertEquals("Hello Grizzly!", responseMsg);
    }

    @After
    public void tearDown() {
        server.shutdownNow();
    }


}
