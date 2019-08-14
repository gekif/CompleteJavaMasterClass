package com.gekif;

public class Main {

    public static void main(String[] args) {
        String number = "12345";
        double balance = 0.00;
        String customerName = "Bob Brown";
        String customerEmailAddress = "myemail@bob.com";
        String customerPhoneNumber = "(087) 123-4567";

        // Testing empty constructor
        Account bobsAccount = new Account();

       /* Account bobsAccount = new Account(
                number, balance, customerName,
                customerEmailAddress, customerPhoneNumber
        );*/

        System.out.println("Account Number: " + bobsAccount.getNumber());
        System.out.println("Account Balance: " + bobsAccount.getBalance());

        System.out.print("\n");
        System.out.println("************************************");
        System.out.println("Account Processing");
        System.out.println("************************************");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
