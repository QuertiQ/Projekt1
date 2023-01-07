public class Phone extends Device {
    Double screenSize;
    public String os;

    public Phone(Integer yearOfProduction, String model, String producer, Double screenSize, String os) {
        super(yearOfProduction, model, producer);
        this.screenSize = screenSize;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
