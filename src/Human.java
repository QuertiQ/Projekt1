import device.Car;

public class Human extends Animal {
    String firstname;
    String lastname;
    Car car;
    Double salary;

    public  Human(String firstname){
        super("homo sapiens");
        this.salary = 0.0;
        this.firstname = firstname;
        this.weight = 70.0;
    }
}
