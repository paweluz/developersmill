package com.developersmill.testdoubles;

import com.developersmill.testdoubles.contracts.Notifier;
import com.developersmill.testdoubles.contracts.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class CarStatisticFakeDummyTest {
    private final UserRepository userDummyRepository = (id) -> Optional.empty();
    private final Notifier notifierDummy = (user) -> {
    };
    private final CarService carService = new CarService(new FakeCarRepository(), userDummyRepository, notifierDummy);

    @Test
    public void whenCarIsInRange_ItIsFound() {
        assertTrue(carService.findClosestCar(90).isPresent());
    }

    @Test
    public void whenCarIsNotInRange_ItIsNotFound() {
        assertFalse(carService.findClosestCar(190).isPresent());
    }

}
