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

    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", fueltype='" + fueltype + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

