package device;

import creatures.Human;

public class Phone extends Device implements Saleable {
   public Double screenSize;
    public String os;

    public Phone(Integer yearOfProduction, String model, String producer, Double screenSize, String os) {
        super(yearOfProduction, model, producer);
        this.screenSize = screenSize;
        this.os = os;
    }

    @Override
    public String toString() {
        return "device.Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przyicsk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("widze logo");
        System.out.println("czekam");
        System.out.println("działa");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash < price){
            System.out.println("nie masz kasy");
    }else if(seller.phone != this){
        System.out.println("nie masz tego telefonu");
    }
else{
        seller.cash += price;
        buyer.cash -= price;
        buyer.phone = seller.phone;
        seller.phone = null;
            System.out.println("telefon został przekazany "+ buyer.firstname + " transakcja przebegla pomyślnie");
    }
}
}

