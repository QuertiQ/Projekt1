import creatures.Animal;
import creatures.FarmAnimals;
import creatures.Human;
import creatures.Pet;
import device.Car;
import device.Disel;
import device.Electric;
import device.Phone;

public class Main {
    public static void main(String[] args) {

        Pet kot = new Pet("Ssak",7.0,true,"Fafik",4);
        Pet krolik = new Pet("Ssak", 3.0, true, "Felek", 3);
        FarmAnimals krowa = new FarmAnimals("Ssak",50.0,true,"Mleko",1200.0);
        krowa.feed(2);
        System.out.println(krowa.weight);
        kot.feed();
        System.out.println(kot.weight);
        Disel citroen = new Disel("C3",3000.0,2000.0,"citroen",2007,370000.0,"diesel","szary","Citroen",12.2);
        Electric tesla = new Electric("x3",100000.0,120000.0,"Tesla",2022,1200.0,"Electric","black","tesla",70.0);
        Human bartek = new Human("Bartek");
        bartek.cash = 50000.0;
        citroen.refuel(10,bartek);
        System.out.println(bartek.cash);
        tesla.refuel(70,bartek);

    }


}