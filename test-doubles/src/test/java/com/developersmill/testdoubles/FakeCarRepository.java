package com.developersmill.testdoubles;

import com.developersmill.testdoubles.contracts.CarRepository;

import java.util.Optional;

public class FakeCarRepository implements CarRepository {
    @Override
    public Optional<CarStatistic> findClosestCar(float range) {
        if (range < 100) {
            return Optional.of(new CarStatistic(500, 5.5F, 137));
        }
        return Optional.empty();
    }
}
