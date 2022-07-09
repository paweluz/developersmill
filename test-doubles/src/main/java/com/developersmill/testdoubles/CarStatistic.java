package com.developersmill.testdoubles;

public class CarStatistic {

    private final int tripDistance;
    private final float averageConsumption;
    private final int maxSpeed;

    public CarStatistic(int tripDistance, float averageConsumption, int maxSpeed) {
        this.tripDistance = tripDistance;
        this.averageConsumption = averageConsumption;
        this.maxSpeed = maxSpeed;
    }

    public int getTripDistance() {
        return tripDistance;
    }

    public float getAverageConsumption() {
        return averageConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
