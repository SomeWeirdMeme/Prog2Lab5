// abstract so you cant make a plain SmartDevice, only specific ones
public abstract class SmartDevice {
    private String brand;
    private String model;
    // no body here, each device decides what its main action is
    public abstract void performMainAction();

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void showBasicInfo(){
        System.out.println("Brand: " + brand + ", Model: " + model);
    }   
}