package com.publicept;

public class Main {

    public static void main(String[] args) {

        // animal
        Animal animal = new Animal("Animal", 1,1, 5, 5);

        animal.eat();
        animal.move(3);

        System.out.println("************");
        System.out.println();


        // dog
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        /**
         * inherited methods from the Animal class:
         */
        dog.eat();
        dog.walk();
        dog.run();

        System.out.println("************");
        System.out.println();


        // fish
        Fish fish = new Fish("Gold Fish", 1, 2, 2, 2, 5);

        fish.move(2);
        fish.rest();
        fish.moveMuscles();
        fish.moveBackFin();
        fish.swim(4);

    }
}
