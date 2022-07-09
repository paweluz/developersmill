package com.developersmill.testdoubles;

import com.developersmill.testdoubles.contracts.CarRepository;
import com.developersmill.testdoubles.contracts.Notifier;
import com.developersmill.testdoubles.contracts.UserRepository;

import java.util.Optional;

public final class CarService {

    private CarRepository carRepository;

    private UserRepository userRepository;

    private Notifier smsNotificationService;

    public CarService(){}

    public CarService(CarRepository carRepository, UserRepository userRepository, Notifier smsNotificationService){
        this.carRepository = carRepository;
        this.userRepository = userRepository;
        this.smsNotificationService = smsNotificationService;
    }

    public Optional<CarStatistic> findClosestCar(float range){
        return carRepository.findClosestCar(range);
    }

    public boolean sentNotificationWhenLimitReached(CarStatistic carStatistic, User user){
        CarRentValidator carRentValidator = new CarRentValidator();
        if (carRentValidator.isMaximumDistanceReached(carStatistic)){
            return this.sendNotification(user);
        }
        return false;
    }

    public boolean sendNotification(User user){
        // smsNotificationService.notify();
        return true;
    }
}
