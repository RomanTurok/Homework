package Lesson11;

public class Truck extends Car{

    protected String bodyType;
    protected int carryingCapacity;
    protected int bodyLengthM;

    public Truck(String model, int year, String brand, int tankCapacity, String bodyType, int carryingCapacity, int bodyLengthM) {
        super(model, year, brand, tankCapacity);
        this.bodyType = bodyType;
        this.carryingCapacity = carryingCapacity;
        this.bodyLengthM = bodyLengthM;
    }


    public String getCarType(){
        return "I`m a Truck";
    }


    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getBodyLengthM() {
        return bodyLengthM;
    }

    public void setBodyLengthM(int bodyLengthM) {
        this.bodyLengthM = bodyLengthM;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "bodyType='" + bodyType + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                ", bodyLengthM=" + bodyLengthM +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}



