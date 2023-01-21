import creatures.Animal;
import creatures.FarmAnimals;
import creatures.Human;
import creatures.Pet;
import device.Car;
import device.Phone;

public class Main {
    public static void main(String[] args) {

        Car passat = new Car("vw",4000.0,3000.0,"vw",1999,160000.0,"diesel","czarny","passat");
        Car fiat = new Car("fiat",2500.0, 2000.0,"fiat",1999,160000.0,"diesel","niebieski", "fiat");
        Pet kot = new Pet("Ssak",7.0,true,"Fafik",4);
        FarmAnimals krowa = new FarmAnimals("Ssak",50.0,true,"Mleko",1200.0);
        krowa.feed(2);
        System.out.println(krowa.weight);
        kot.feed();
        System.out.println(kot.weight);


    }


}