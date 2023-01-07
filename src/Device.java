public class Device {
    String model;
    String producer;
    Integer yearOfProduction;

    public Device(Integer yearOfProduction, String model, String producer) {
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.producer = producer;
    }
}
