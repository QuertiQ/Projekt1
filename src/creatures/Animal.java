package creatures;

import device.Saleable;

public class Animal implements Saleable {
    public String species;
    public String name;
    public Double weight;
    public  Boolean alive;

    public Animal(String species) {
        this.species = species;
    }
    public void feed(){
        if(this.alive == true) {
            this.weight += 0.5;
            System.out.println(this.name + " zostal nakarmiony jego aktualna waga to: " + this.weight);
        }
        else{
            System.out.println("nie mozesz nakarmic martwego zwierzecia");
        }

    }
    public void takeForAWalk(){
        if(this.alive == true) {

            this.weight -= 0.5;

        System.out.println(this.name +" zostal zabrany na spacer jego aktualna waga to: " + this.weight);
            if (this.weight <= 0)
            {
                System.out.println("twój kot umarl");
                this.alive = false;
            }
    }
        else{
            System.out.println("nie mozesz wyjsc na spacer z martwym zwierzeciem");
        }

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash < price){
            System.out.println("nie masz kasy");
        }else if(seller.animal != this){
            System.out.println("nie masz tego zwierzęcia");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.animal = seller.animal;
            seller.animal = null;
            System.out.println("zwierze zostało przekazane "+ buyer.firstname + " transakcja przebegla pomyślnie");
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
}
