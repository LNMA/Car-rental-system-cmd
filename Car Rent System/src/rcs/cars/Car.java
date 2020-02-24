package rcs.cars;

import java.io.Serializable;

public class Car implements Serializable {
    private String idCar;
    private String carType;
    private String maker;
    private String modelName;
    private int modelYear;
    private int numberOfSeats;
    private String registrationNumber;
    private String plateNumber;
    private double lastMeterReading;
    private double costPerDay;
    private double costPerKm;
    private String status;
    private static int sequence;

    public Car(String carType, String maker, String modelName, int modelYear, int numberOfSeats, String registrationNumber, String plateNumber, double lastMeterReading, double costPerDay, double costPerKm, String status) {
        this.idCar = Integer.toString(++sequence);
        this.carType = carType;
        this.maker = maker;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.numberOfSeats = numberOfSeats;
        this.registrationNumber = registrationNumber;
        this.plateNumber = plateNumber;
        this.lastMeterReading = lastMeterReading;
        this.costPerDay = costPerDay;
        this.costPerKm = costPerKm;
        this.status = status;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getLastMeterReading() {
        return lastMeterReading;
    }

    public void setLastMeterReading(double lastMeterReading) {
        this.lastMeterReading = lastMeterReading;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        Car.sequence = sequence;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar='" + idCar + '\'' +
                ", carType='" + carType + '\'' +
                ", maker='" + maker + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelYear=" + modelYear +
                ", numberOfSeats=" + numberOfSeats +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", vehicleIdentificationNumber='" + plateNumber + '\'' +
                ", lastMeterReading=" + lastMeterReading +
                ", costPerDay=" + costPerDay +
                ", costPerKm=" + costPerKm +
                ", status='" + status + '\'' +
                '}';
    }
}
