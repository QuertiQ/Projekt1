public class Phone extends Device {
    String screenSize;
    public String os;

    public Phone(Integer yearOfProduction, String model, String producer, String screenSize, String os) {
        super(yearOfProduction, model, producer);
        this.screenSize = screenSize;
        this.os = os;
    }
}
