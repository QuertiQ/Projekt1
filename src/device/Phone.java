package device;

public class Phone extends Device {
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
}
