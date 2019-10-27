package com.publicept;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        //System.out.println("Model is " + porsche.getModel());   // model is null (Java default for classes
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
