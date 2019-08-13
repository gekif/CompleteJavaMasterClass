package com.gekif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // User input object
        Scanner scanner = new Scanner(System.in);


        // Input Year of birth
        System.out.print("Enter your year of birth: ");

        // Check if the number is numeric or character
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)


            // Input Name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();


            // To know your age
            int age = 2019 - yearOfBirth;


            // Age Validation
            if (age >= 0 && age <= 100) {

                // Output
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
