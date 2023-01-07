public class Car extends Device {
    Double millage;
    String fueltype;

    public Car(String model, String producer, Integer yearOfProduction, Double millage, String fueltype) {
        super(yearOfProduction, model, producer);
        this.millage = millage;
        this.fueltype = fueltype;
    }
}

