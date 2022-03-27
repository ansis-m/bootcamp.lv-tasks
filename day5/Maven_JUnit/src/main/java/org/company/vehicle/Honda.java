package org.company.vehicle;

public class Honda extends Car {

    public String model;

    Honda(String color) {
        super(color);
    }

    Honda(String color, int year) {
        super(color, year);
    }

    Honda(String color, int year, String model) {
        super(color, year);
        this.model = model;
    }

    @Override
    public int getDistance(){
        System.out.println("\nDriving " + model);
        return super.getDistance();
    }

    @Override
    public String getDirection(){

        System.out.println("\nDriving " + model);
        return super.getDirection();
    }
}
