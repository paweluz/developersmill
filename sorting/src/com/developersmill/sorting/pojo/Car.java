package com.developersmill.sorting.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public final class Car {

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

    static class YearComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.yearOfProduction - o2.yearOfProduction;
        }
    }

    static class HorsePowerComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.horsePower - o2.horsePower;
        }
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

        //Provide different implementations of comparators with new classes
        cars.sort(new YearComparator()); // sort data using the year of production like in the first example
        cars.sort(new HorsePowerComparator());

        //Using Java streams with mutable list
        List<Car> sorted1 = new ArrayList<>();
        cars.stream()
                .sorted((car1, car2) -> car1.yearOfProduction - car2.yearOfProduction)
                .forEach(car -> sorted1.add(car));

        List<Car> sorted2 = new ArrayList<>();
        cars.stream()
                .sorted(new YearComparator())
                .forEach(car -> sorted2.add(car));

        //Using the Java 8 streams with collect method
        List<Car> sorted3 = cars.stream()
                .sorted(new YearComparator())
                .collect(Collectors.toList());

        //Functional style with Comparator
        Comparator<Car> years = (car1, car2) -> car1.yearOfProduction - car2.yearOfProduction;

        List<Car> sorted4 = cars.stream()
                .sorted(years)
                .collect(Collectors.toList());

        //Functional style with Function and Comparing
        Function<Car, Integer> year1 = car -> car.yearOfProduction;
        Function<Car, Integer> horsePower = car -> car.horsePower;

        List<Car> sorted5 = cars.stream()
                .sorted(Comparator.comparing(year1).thenComparing(horsePower))
                .collect(Collectors.toList());

        sorted5.forEach(System.out::println);

    }


}
