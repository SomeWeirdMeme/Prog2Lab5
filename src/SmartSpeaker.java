public class SmartSpeaker extends SmartDevice implements Connectable {

    public SmartSpeaker(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void performMainAction() {
        System.out.println("SmartSpeaker is playing music.");
    }

    public void playMusic() {
        System.out.println("Playing a song...");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("SmartSpeaker connected to WiFi.");
    }
}
