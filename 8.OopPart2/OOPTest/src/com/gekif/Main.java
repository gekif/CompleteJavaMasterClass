package com.gekif;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);

//        price = hamburger.itemizeHamburger();
        System.out.println("The Total Burger Price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("The Total Healthy Burger Price is " + healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Should not do this", 50.53);
        db.itemizeHamburger();

    }
}
