package com.developersmill.testdoubles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class CarStatisticStubTest {

    @Mock
    private CarStatistic carStatistic;

    @Test
    public void ifTripDistanceIsOverMaximumValue_thenValidatorShouldReturnTrue(){
        Mockito.when(carStatistic.getTripDistance()).thenReturn(600);
        CarRentValidator carRentValidator = new CarRentValidator();
        assertTrue(carRentValidator.isMaximumDistanceReached(carStatistic));
    }
}
