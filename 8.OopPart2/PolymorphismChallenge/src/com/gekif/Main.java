package com.gekif;

class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cyclinders, String name) {
        this.cylinders = cyclinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car -> Start Engine";
    }

    public String accelerate() {
        return "Car -> Accelerate";
    }

    public String brake() {
        return "Car -> Brake";
    }
}


class Mithusbishi extends Car {

    public Mithusbishi(int cyclinders, String name) {
        super(cyclinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubitshi -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Mitshubitshi -> Accelerate";
    }

    @Override
    public String brake() {
        return "Mitshubitshi -> Brake";
    }

}

class Ford extends Car {

    public Ford(int cyclinders, String name) {
        super(cyclinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> Accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> Brake";
    }
}


class Holden extends Car {

    public Holden(int cyclinders, String name) {
        super(cyclinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Holden -> Accelerate";
    }

    @Override
    public String brake() {
        return "Holden -> Brake";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mithusbishi mithusbishi = new Mithusbishi(6, "Outlander VRW 4WD");
        System.out.println(mithusbishi.startEngine());
        System.out.println(mithusbishi.accelerate());
        System.out.println(mithusbishi.brake());

        Ford ford = new Ford(8, "Ford AS400");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(7, "Holden");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
