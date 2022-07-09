package com.developersmill.testdoubles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarStatisticMockTest {

    @Test
    public void whenLimitIsReached_smsNotificationIsSent() {
        CarService carService = new CarService();
        CarStatistic carStatistic = new CarStatistic(600, 7L, 185);
        User user = new User(123, "3442-2333-22331");
        Assertions.assertTrue(carService.sentNotificationWhenLimitReached(carStatistic, user));
    }
}
