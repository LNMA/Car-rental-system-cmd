package rcs.order;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

abstract public class RentalOrder implements Serializable {
    protected String orderType;
    private String carID;
    private String carType;
    private String maker;
    private String modelName;
    private String registrationNumber;
    private String plateNumber;
    private String paymentMethod;
    private double totalBill;
    private int numberOfDays;
    private double startOdometer;
    private double endOdometer;
    private int orderID;
    private static int sequenceOrder;
    private Date orderDate;

    public RentalOrder( String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer) {
        this.orderType = orderType;
        this.carID = carID;
        this.carType = carType;
        this.maker = maker;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.plateNumber = plateNumber;
        this.paymentMethod = paymentMethod;
        this.numberOfDays = numberOfDays;
        this.startOdometer = startOdometer;
        this.endOdometer = endOdometer;
        setOrderID(++sequenceOrder);
        setOrderDate();
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getStartOdometer() {
        return startOdometer;
    }

    public void setStartOdometer(double startOdometer) {
        this.startOdometer = startOdometer;
    }

    public double getEndOdometer() {
        return endOdometer;
    }

    public void setEndOdometer(double endOdometer) {
        this.endOdometer = endOdometer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate() {
        this.orderDate = new GregorianCalendar().getTime();
    }

    public String getOrderType() {
        return orderType;
    }

    abstract public void setOrderType();

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    abstract public void carRentCalculation(double costPerDay,double costPerKm);

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
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

    public static int getSequenceOrder() {
        return sequenceOrder;
    }

    public static void setSequenceOrder(int sequenceOrder) {
        RentalOrder.sequenceOrder = sequenceOrder;
    }

    @Override
    public String toString() {
        if (getTotalBill() == 0){
            return "No order" ;
        }else {
            return "RentalOrder{" +
                    "orderType='" + orderType + '\'' +
                    ", carID='" + carID + '\'' +
                    ", carType='" + carType + '\'' +
                    ", maker='" + maker + '\'' +
                    ", modelName='" + modelName + '\'' +
                    ", registrationNumber='" + registrationNumber + '\'' +
                    ", plateNumber='" + plateNumber + '\'' +
                    ", paymentMethod='" + paymentMethod + '\'' +
                    ", numberOfDays=" + numberOfDays +" day"+
                    ", startOdometer=" + startOdometer +" km"+
                    ", endOdometer=" + endOdometer +" km"+
                    ", orderDate=" + orderDate +" $"+
                    ", totalBill=" + totalBill +
                    '}';
        }
    }
}
