public class Main {
    public static void main(String[] args) {

        Car passat = new Car("vw", "passat", 2001);
        passat.millage = 70000.0;

        System.out.println("Producent: " + passat.producer);
        System.out.println("Model auta: " + passat.model);
        System.out.println("Rok produkcji: " + passat.yearOfProduction);
        System.out.println("Przebieg: " + passat.millage);

        Car fiat = new Car("fiat","bravo",2010);
        fiat.millage = 312312.5;
        System.out.println();
        System.out.println("Producent: " + fiat.producer);
        System.out.println("Model auta: " + fiat.model);
        System.out.println("Rok produkcji: " + fiat.yearOfProduction);
        System.out.println("Przebieg: " + fiat.millage);

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
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed();




    }

}