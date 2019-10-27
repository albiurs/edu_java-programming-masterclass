package com.publicept;

import com.publicept.car.Car;
import com.publicept.car.model.Corvette;
import com.publicept.car.model.Ford;
import com.publicept.car.model.Mitsubishi;

/**
 * This training video shows lots of refactor options in IntelliJ:
 * Video 07-95 @ 9:49 until the end of the video...
 */

public class Main {

    public static void main(String[] args) {

        /**
         * Polymorphism Challenge
         */
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        // show a message for each in the base class
        //
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
        Car car = new Car(0, "Base Car");
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Pickup 4WD", true);
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.isLoadArea());
        System.out.println();

        Ford ford = new Ford(6, "Ford Falcon", true);
        System.out.println(ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.isTrunk());
        System.out.println();

        Corvette corvette = new Corvette(8, "Corvette C8");
        System.out.println(corvette.getName());
        System.out.println(corvette.startEngine());
        System.out.println(corvette.accelerate());
        System.out.println(corvette.brake());
        System.out.println(corvette.isRearSpoiler());
        System.out.println();

    }
}
