// extends one class, implements two interfaces
public class SmartPhone extends SmartDevice implements Chargeable, Connectable {

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void performMainAction() {
        System.out.println("SmartPhone is making a phone call.");
    }

    public void makeCall() {
        System.out.println("Calling...");
    }

    @Override
    public void charge() {
        System.out.println("SmartPhone is charging.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartPhone connected to WiFi.");
    }
}
