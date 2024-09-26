package Lesson11;

public class Car {

    protected String model;
    protected int year;
    protected String brand;
    protected int tankCapacity;

    public Car() {
    }

    public Car(String model, int year, String brand, int tankCapacity) {
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.tankCapacity = tankCapacity;
    }

    public String getCarType(){
        return "I`m a Car";
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void drive(){
        System.out.println("Drive");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void turnOnLights(){
        System.out.println("Lights is on");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}

