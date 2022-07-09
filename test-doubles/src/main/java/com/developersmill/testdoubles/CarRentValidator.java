package com.developersmill.testdoubles;

public class CarRentValidator {

    private static final int MAX_DISTANCE_ALLOWED = 500;

    public boolean isMaximumDistanceReached(CarStatistic carStatistic) {
        return carStatistic.getTripDistance() > MAX_DISTANCE_ALLOWED;
    }
}
