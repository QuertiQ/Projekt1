package creatures;

import creatures.Animal;
import device.Car;
import device.Phone;

import java.time.LocalDateTime;

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

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobierane " + LocalDateTime.now());
        System.out.println("Wartość wypłaty przed zwróceniem: " + this.salary);
        return this.salary;
    }



    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Nie można przypisać ujemnej wartości wypłaty!");
            return;
        }
        else{
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Konieczność odebrania aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma sensu ukrywać dochodu.");
        this.salary = salary;
     }
    }
    public Car getCar() {
        return this.car;
    }
    public void setCar(Car car, Double price) {
        if(this.salary > price) {
            System.out.println("Udało się kupić samochód za gotówkę.");
            this.car = car;
        } else if (this.salary > (price/12)) {
            System.out.println("Udało się kupić samochód na kredyt.");
            this.car = car;
        } else {
            System.out.println("Nie stać cię na ten samochód.");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", car=" + car +
                ", cash=" + cash +
                ", phone=" + phone +
                ", animal=" + animal +
                ", salary=" + salary +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Sprzedaż ludzi jest zabroniona.");
        return;
    }
}


