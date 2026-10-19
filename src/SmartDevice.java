public abstract class SmartDevice {
    private String brand;
    private String model;
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