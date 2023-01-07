public class Phone extends Device {
    Double screenSize;
    public String os;

    public Phone(Integer yearOfProduction, String model, String producer, Double screenSize, String os) {
        super(yearOfProduction, model, producer);
        this.screenSize = screenSize;
        this.os = os;
    }
}
