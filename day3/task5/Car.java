public class Car extends Vehicle {

    public String color;
    public int year;

    Car(String color){
        super();
        this.color = color;
    }

    Car(String color, int year){
        super();
        this.color = color;
        this.year = year;
    }

}