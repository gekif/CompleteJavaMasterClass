package com.gekif;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        String model = "Carerra";
        porsche.setModel(model);

        System.out.println("Model is " + porsche.getModel());

    }
}
