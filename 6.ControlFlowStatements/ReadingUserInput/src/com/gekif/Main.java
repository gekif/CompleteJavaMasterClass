package com.gekif;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User input object
        Scanner scanner = new Scanner(System.in);

        // Input Year of birth
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        // Input Name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // To know your age
        int age = 2019 - yearOfBirth;

        // Output
        System.out.println("Your name is " + name + ", and you are " + age + " years old");

        scanner.close();
    }
}
