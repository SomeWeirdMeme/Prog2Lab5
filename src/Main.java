public class Main {

    // takes anything that implements Chargeable
    public static void testCharging(Chargeable device) {
        device.charge();
    }

    public static void main(String[] args) {
        // parent type reference, child object
        SmartDevice d1 = new SmartPhone("Apple", "iPhone");
        SmartDevice d2 = new SmartSpeaker("Google", "Nest");

        d1.showBasicInfo();
        d1.performMainAction();

        d2.showBasicInfo();
        d2.performMainAction();

        SmartPhone phone = new SmartPhone("Samsung", "Galaxy");
        SmartSpeaker speaker = new SmartSpeaker("Amazon", "Echo");

        phone.connectToWiFi();
        speaker.connectToWiFi();

        testCharging(phone);

        // testCharging(speaker); 

        // Why can testCharging() accept a SmartPhone even though the
        // parameter type is Chargeable?
        // Because SmartPhone implements Chargeable, so a SmartPhone "is a"
        // Chargeable. Any object of a class that implements the interface
        // can be passed where that interface type is expected.

        // Why does Java reject the SmartSpeaker?
        // SmartSpeaker only implements Connectable, not Chargeable, so it
        // isn't a Chargeable and the compiler gives a type error.
    }
}
