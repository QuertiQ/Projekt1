public class Car extends Device {
    Double millage;
    String fueltype;
    String color;

    public Car(String model, String producer, Integer yearOfProduction, Double millage, String fueltype, String color) {
        super(yearOfProduction, model, producer);
        this.millage = millage;
        this.fueltype = fueltype;
        this.color = color;
    }
}

