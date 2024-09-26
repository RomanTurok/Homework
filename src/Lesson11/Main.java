package Lesson11;

import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {

        PassengerCar car1 = new PassengerCar("X5", 2018, "BMW", 65, "SUV", 5, "Diesel");
        System.out.println(car1 + "\n" + car1.getCarType() + "\n");

        Truck truck1 = new Truck("F350", 2020, "Ford", 90, "PickUp", 2000, 7);
        System.out.println(truck1 + "\n" + truck1.getCarType());
    }
}
