package device;

public class Car extends Device {
   public Double millage;
   public String fueltype;
   public String color;

    public Car(String model, String producer, Integer yearOfProduction, Double millage, String fueltype, String color) {
        super(yearOfProduction, model, producer);
        this.millage = millage;
        this.fueltype = fueltype;
        this.color = color;
    }

    @Override
    public String toString() {
        return "device.Car{" +
                "millage=" + millage +
                ", fueltype='" + fueltype + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("przekrecam kluczyk");
        System.out.println("czekam");
        System.out.println("odpala");
    }
}

