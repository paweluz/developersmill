package com.developersmill.testdoubles.contracts;

import com.developersmill.testdoubles.CarStatistic;

import java.util.Optional;

public interface CarRepository {
    Optional<CarStatistic> findClosestCar(float range);
}
