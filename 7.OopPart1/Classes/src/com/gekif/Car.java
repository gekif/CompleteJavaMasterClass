package com.gekif;

public class Car {

    /**
     * List of state/ attribute
     */
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    /**
     * Create method
     */

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        if (validModel.equals("carerra") || validModel.equals("comoddo")) {
            this.model = model;
        } else {
           this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }


}
