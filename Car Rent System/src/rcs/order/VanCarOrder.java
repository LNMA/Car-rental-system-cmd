package rcs.order;

import rcs.order.RentalOrder;

import java.io.Serializable;

public class VanCarOrder extends RentalOrder implements Serializable {

    private double bill;
    private final double COST_OF_VAN_PER_DAY_INSURANCE = 3;

    public VanCarOrder(String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm) {
        super( carID,  carType,  maker,  modelName,  registrationNumber,  plateNumber,  paymentMethod,  numberOfDays,  startOdometer,  endOdometer);
        carRentCalculation( costPerDay, costPerKm);
        setOrderType();
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    @Override
    public void setOrderType() {
        super.orderType = "Van Car Order";
    }

    @Override
    public void carRentCalculation(double costPerDay,double costPerKm){
        double total = (getNumberOfDays()*costPerDay) + ((getEndOdometer()-getStartOdometer())*costPerKm)+(getNumberOfDays()*COST_OF_VAN_PER_DAY_INSURANCE);
        setBill(total);
    }

    @Override
    public String toString() {
        return super.toString()+
                "VanCarOrder{" +
                "bill=" + bill + " $"+
                ", orderID=" + getOrderID() +
                '}';
    }
}
