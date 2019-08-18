package com.gekif;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("Initial Page Count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed was " + pagesPrinted + " New Total Print Count For Printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed was " + pagesPrinted + " New Total Print Count For Printer = " + printer.getPagesPrinted());
    }
}
