public class Main {
    public static void main(String[] args) {

        Car passat = new Car("vw","vw",1999,160000.0,"diesel","czarny");
        passat.millage = 70000.0;

        System.out.println("Producent: " + passat.producer);
        System.out.println("Model auta: " + passat.model);
        System.out.println("Rok produkcji: " + passat.yearOfProduction);
        System.out.println("Przebieg: " + passat.millage);
        Car fiat = new Car("fiat","fiat",1999,160000.0,"diesel","niebieski");

        fiat.millage = 312312.5;
        System.out.println();
        System.out.println("Producent: " + fiat.producer);
        System.out.println("Model auta: " + fiat.model);
        System.out.println("Rok produkcji: " + fiat.yearOfProduction);
        System.out.println("Przebieg: " + fiat.millage);
        Phone samsung = new Phone(2016,"s21","samsung",20.5,"android");
        System.out.println("Producent " + samsung.producer);
        System.out.println("Model " + samsung.model);
        System.out.println("Rok produkcji  " + samsung.yearOfProduction);
        System.out.println("Wielkosc obrazu  " + samsung.screenSize);
        System.out.println("System " + samsung.os);

        Animal kot = new Animal("Ssak");
        kot.name = "puszek";
        kot.weight = 1.5;
        kot.alive = true;

        System.out.println("gatunek: " + kot.species);
        System.out.println("imie: " + kot.name);
        System.out.println("waga: " + kot.weight);
        if(kot.alive == true)
        {
            System.out.println("czy zyje: tak");}
        else{
            System.out.println("czy zyje: nie");
        }
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed();

        Human kacper = new Human("Kacper");

        System.out.println(kacper.weight);
        System.out.println(kacper.species);


    }

}