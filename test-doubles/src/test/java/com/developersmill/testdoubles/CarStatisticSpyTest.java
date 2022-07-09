package com.developersmill.testdoubles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CarStatisticSpyTest {

    @Spy
    private CarService carServiceSpy;

    @Test
    public void whenLimitIsReached_smsNotificationIsSentJustOnce() {
        CarStatistic carStatistic = new CarStatistic(600, 7L, 185);
        User user = new User(123, "3442-2333-22331");
        carServiceSpy.sentNotificationWhenLimitReached(carStatistic, user);
        verify(carServiceSpy, times(1)).sendNotification(user);
    }
}
