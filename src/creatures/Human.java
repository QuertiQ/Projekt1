package creatures;

import creatures.Animal;
import device.Car;
import device.Phone;

public class Human extends Animal {
   public String firstname;
    public String lastname;
    public Car car;
    public Double cash;
    public Phone phone;
    public Animal animal;
    public Double salary;

    public  Human(String firstname){
        super("homo sapiens");
        this.salary = 0.0;
        this.firstname = firstname;
        this.weight = 70.0;
    }
}
