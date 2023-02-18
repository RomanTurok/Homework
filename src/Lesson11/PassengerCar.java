package Lesson11;

public class PassengerCar extends Car {
    protected String bodyTape;
    protected int numberOfSeats;
    protected String fuelType;

    public PassengerCar(String model, int year, String brand, int tankCapacity, String bodyTape, int numberOfSeats, String fuelType) {
        super(model, year, brand, tankCapacity);
        this.bodyTape = bodyTape;
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public String getCarType(){
        return "I`m a Passenger Car";
    }

    public String getBodyTape() {
        return bodyTape;
    }

    public void setBodyTape(String bodyTape) {
        this.bodyTape = bodyTape;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "bodyTape='" + bodyTape + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", fuelType='" + fuelType + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", tankCapacity='" + tankCapacity + '\'' +
                '}';
    }
}
