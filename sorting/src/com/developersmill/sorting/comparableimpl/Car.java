package com.developersmill.sorting.comparableimpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Car implements Comparable<Car> {

    private final int yearOfProduction;
    private final int horsePower;
    private final String brand;
    private final String model;

    public Car(int yearOfProduction, int horsePower, String brand, String model) {
        this.yearOfProduction = yearOfProduction;
        this.horsePower = horsePower;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", horsePower=" + horsePower +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return yearOfProduction - car.yearOfProduction;
    }


    public static void main(String[] args) {
        final List<Car> cars = Arrays.asList(
                new Car(1989, 60, "Toyota", "Yaris"),
                new Car(2010, 90, "Mazda", "3"),
                new Car(2004, 110, "Toyota", "Corolla"),
                new Car(1999, 150, "BMW", "5"),
                new Car(2010, 60, "Renault", "Clio"),
                new Car(2016, 70, "Renault", "Twingo"),
                new Car(2021, 190, "Skoda", "Superb"));

        // Implementing Comparable interface
        Collections.sort(cars);
    }
}
