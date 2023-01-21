package creatures;

import device.Saleable;

abstract public class Animal implements Saleable, Feedable {
    public String species;
    public Double weight;
    public  Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.weight = 0.0;
        this.alive = true;
    }
    public void feed(){
        if(this.alive == true) {
            this.weight += 0.5;
            System.out.println("zwierzak zostal nakarmiony jego aktualna waga to: " + this.weight);
        }
        else{
            System.out.println("nie mozesz nakarmic martwego zwierzecia");
        }

    }
    public void takeForAWalk(){
        if(this.alive == true) {

            this.weight -= 0.5;

        System.out.println("zwierzak zostal zabrany na spacer jego aktualna waga to: " + this.weight);
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
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
    @Override
    public void feed(double foodWeight) {
        if(this.alive == true) {
            this.weight += foodWeight;
            System.out.println("zwierzak zostal nakarmiony " + foodWeight + " kg jego aktualna waga to: " + this.weight);
        }
        else{
            System.out.println("nie mozesz nakarmic martwego zwierzecia");
        }
    }
}