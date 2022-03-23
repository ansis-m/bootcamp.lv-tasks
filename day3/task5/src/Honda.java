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
}
