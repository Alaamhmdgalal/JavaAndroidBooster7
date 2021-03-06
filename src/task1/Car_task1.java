package task1;

public class Car_task1 {
    private String model;
    private String design;
    private String fuel;
    private String maxPower;
    private int maxSpeed;


    public Car_task1(String model, String fuel){
        this.model=model;
        this.fuel=fuel;
    }

    public Car_task1(String model, String design, String fuel){
        this.model=model;
        this.design=design;
        this.fuel=fuel;
    }

    public Car_task1(String model, String design, String fuel, String maxPower){
        this.model=model;
        this.design=design;
        this.fuel=fuel;
        this.maxPower=maxPower;
    }

    public Car_task1(String model, String design, String fuel, String maxPower, int maxSpeed){
        this.model=model;
        this.design=design;
        this.fuel=fuel;
        this.maxPower=maxPower;
        this.maxSpeed=maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getDesign() {
        return design;
    }

    public String getFuel() {
        return fuel;
    }

    public String getMaxPower() {
        return maxPower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxPower(String maxPower) {
        this.maxPower = maxPower;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setFuelType(String fuel) {
        this.fuel = fuel;
    }

    public String getFuelType(String fuelType){
        return "Petrol";
    };

    public void printData(){
        System.out.println("Model: " + model + "\nDesign: " + design + "\nFuel type: " +
                fuel + "\nMax power: " + maxPower + "\nMax speed: " + maxSpeed);
    }


}
