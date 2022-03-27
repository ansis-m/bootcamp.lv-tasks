package org.company.vehicle;

public class Main {

    public static void main(String[] args) {
        Honda civic = new Honda("red", 2014, "civic");
        civic.accelerate(60);
        civic.drive(5);
        civic.decelerate();
        civic.drive(2);

        civic.getSpeed();
        civic.getDirection();
        civic.getDistance();
    }
}