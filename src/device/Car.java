package device;

import creatures.Human;

import java.util.Objects;

public class Car extends Device implements Saleable {
   public Double millage;
   public String fueltype;
   public String color;
   public Double value;
   public Double price;
   public String name;

    public Car(String model,Double value,Double price, String producer, Integer yearOfProduction, Double millage, String fueltype, String color, String name) {
        super(yearOfProduction, model, producer);
        this.millage = millage;
        this.fueltype = fueltype;
        this.color = color;
        this.price = price;
        this.value = value;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(millage, car.millage) && Objects.equals(fueltype, car.fueltype) && Objects.equals(color, car.color) && Objects.equals(value, car.value) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(millage, fueltype, color, value, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", fueltype='" + fueltype + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", price=" + price +
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


    @Override
        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.cash < price) {
                System.out.println("nie masz kasy");
            } else if (seller.car != this) {
                System.out.println("nie masz auta");
            } else {
                seller.cash += price;
                buyer.cash -= price;
                buyer.car = seller.car;
                seller.car = null;
                System.out.println("auto zostało przekazane "+ buyer.firstname + " transakcja przebegla pomyślnie");

            }
        }

    }

