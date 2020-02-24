package rcs.userList;

import rcs.order.CompactCarOrder;
import rcs.order.RentalOrder;
import rcs.order.SedanCarOrder;
import rcs.order.VanCarOrder;
import rcs.user.Customer;

import java.io.Serializable;
import java.util.ArrayList;

public class CustomerLists extends Customer implements Serializable {

    private ArrayList<RentalOrder> orders = new ArrayList<>();

    public CustomerLists(String userName, String password, String name, String gender, int year, int month, int day, String telefone, String email, String address) {
        super(userName, password, name, gender, year, month, day, telefone, email, address);
    }

    public void setCompactCarOrder(String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm) {
        orders.add(new CompactCarOrder( carID,  carType,  maker,  modelName,  registrationNumber,  plateNumber,  paymentMethod,  numberOfDays,  startOdometer,  endOdometer, costPerDay, costPerKm));
        double bill = ((CompactCarOrder)orders.get(orders.size()-1)).getBill();
        double totalBills = orders.get(orders.size()-2).getTotalBill();
        totalBills += bill;
        orders.get(orders.size()-1).setTotalBill(totalBills);
        System.out.print("\n>>your bill is: "+bill+"$, And total bills will be: "+totalBills+"$");
        addLoyalty();
    }

    public void setSedanCarOrder(String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm) {
        orders.add(new SedanCarOrder( carID,  carType,  maker,  modelName,  registrationNumber,  plateNumber,  paymentMethod,  numberOfDays,  startOdometer,  endOdometer, costPerDay, costPerKm));
        System.out.print("\n>>your bill is: "+((SedanCarOrder)orders.get(orders.size()-1)).getBill()+"$, And total bills will be: "+orders.get(orders.size()-1).getTotalBill()+"$");
        double bill = ((CompactCarOrder)orders.get(orders.size()-1)).getBill();
        double totalBills = orders.get(orders.size()-2).getTotalBill();
        totalBills += bill;
        orders.get(orders.size()-1).setTotalBill(totalBills);
        System.out.print("\n>>your bill is: "+bill+"$, And total bills will be: "+totalBills+"$");
        addLoyalty();

    }

    public void setVanCarOrder(String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm) {
        orders.add(new VanCarOrder( carID,  carType,  maker,  modelName,  registrationNumber,  plateNumber,  paymentMethod, numberOfDays, startOdometer, endOdometer, costPerDay, costPerKm));
        System.out.print("\n>>your bill is: "+((VanCarOrder)orders.get(orders.size()-1)).getBill()+"$, And total bills will be: "+orders.get(orders.size()-1).getTotalBill()+"$");
        double bill = ((CompactCarOrder)orders.get(orders.size()-1)).getBill();
        double totalBills = orders.get(orders.size()-2).getTotalBill();
        totalBills += bill;
        orders.get(orders.size()-1).setTotalBill(totalBills);
        System.out.print("\n>>your bill is: "+bill+"$, And total bills will be: "+totalBills+"$");
        addLoyalty();
    }

    public double getTotalBills(){
        int last = orders.size()-1;
        double total = 0;
        if (orders.get(last) != null){
            total = orders.get(orders.size()-1).getTotalBill();
        }
        return total;
    }

    public int getLargeOrderID(){
        int temp = 0;
        int max = 0;
        for (int i = 0;i<orders.size();i++){
            if (orders.get(i) != null){
                temp = orders.get(i).getOrderID();
            if (temp > max) {
                max = temp;
            }
            }
        }
        return max;
    }

    public void addLoyalty(){
        double totalBills = getTotalBills();
        double loyalty;
        if (totalBills > 100 && totalBills<500){
            loyalty = getLoyalty();
            loyalty += 2;
            setLoyalty(loyalty);
        }
        if (totalBills>500 && totalBills<1000){
            loyalty = getLoyalty();
            loyalty += 5;
            setLoyalty(loyalty);
        }
        if (totalBills>1000){
            loyalty = getLoyalty();
            loyalty += 7;
            setLoyalty(loyalty);
        }
    }

    public void useLoyalty(double point){
        double totalBills = getTotalBills();
        double myDiscountPoint = getLoyalty();
        double myPoint;
        double bill;
        double discount;
        int index = orders.size()-1;
        if ((orders.get(index) instanceof CompactCarOrder) && (orders.get(index) != null)) {
            if (point <= myDiscountPoint) {
                myDiscountPoint -= point;
                setLoyalty(myDiscountPoint);
                bill = ((CompactCarOrder)(orders).get(index)).getBill();
                myPoint = point / 100;
                discount = bill*myPoint;
                bill -= discount;
                totalBills -=discount;
                orders.get(index).setTotalBill(totalBills);
                ((CompactCarOrder)(orders).get(index)).setBill(bill);
                System.out.print("\n>>now your bill is: "+bill+"$, and your total bills is: "+totalBills+"$");
            }else
                System.out.print(">>sorry but you have not this amount of point");
        }
        if ((orders.get(index) instanceof SedanCarOrder) && (orders.get(index) != null)) {
            if (point <= myDiscountPoint) {
                myDiscountPoint -= point;
                setLoyalty(myDiscountPoint);
                bill = ((SedanCarOrder)(orders).get(index)).getBill();
                myPoint = point / 100;
                discount = bill*myPoint;
                bill -= discount;
                totalBills -=discount;
                orders.get(index).setTotalBill(totalBills);
                ((SedanCarOrder)(orders).get(index)).setBill(bill);
                System.out.print("\n>>now your bill is: "+bill+"$, and your total bills is: "+totalBills+"$");
            }else
                System.out.print(">>sorry but you have not this amount of point");
        }
        if ((orders.get(index) instanceof VanCarOrder) && (orders.get(index) != null)) {
            if (point <= myDiscountPoint) {
                myDiscountPoint -= point;
                setLoyalty(myDiscountPoint);
                bill = ((VanCarOrder)(orders).get(index)).getBill();
                myPoint = point / 100;
                discount = bill*myPoint;
                bill -= discount;
                totalBills -=discount;
                orders.get(index).setTotalBill(totalBills);
                ((VanCarOrder)(orders).get(index)).setBill(bill);
                System.out.print("\n>>now your bill is: "+bill+"$, and your total bills is: "+totalBills+"$");

            }else
                System.out.print(">>sorry but you have not this amount of point");
        }
    }

    public void removeOrder(int id){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orderNotExist = false;
                    System.out.print("\nremove operation done successfully");
                    orders.remove(i);
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public int verificationNewOrderID(int newID){
        boolean orderExist = false;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == newID){
                    orders.get(i).setOrderID(newID);
                    orderExist = true;
                    System.out.print("\nthere already id order have this number.");
                    break;
                }
            }
        }
        if (orderExist)
            return -1;
        else
            return newID;
    }

    public void editOrderID(int id,int newID){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setOrderID(newID);
                    orderNotExist = false;
                    System.out.print("\nid order change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderCarID(int id,String newID){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setCarID(newID);
                    System.out.print("\nid car change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editCarType(int id,String carType){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setCarID(carType);
                    System.out.print("\ncar type change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderCarMaker(int id,String carMaker){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setCarType(carMaker);
                    System.out.print("\ncar maker change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderCarModel(int id,String carModel){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setModelName(carModel);
                    System.out.print("\ncar model change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderCarRegistrationNumber(int id,String registrationNumber){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setRegistrationNumber(registrationNumber);
                    System.out.print("\ncar registration Number change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderCarPlatENumber(int id,String plateNumber){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setPlateNumber(plateNumber);
                    System.out.print("\ncar plate Number change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderCarPaymentMethod(int id,String paymentMethod){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setPaymentMethod(paymentMethod);
                    System.out.print("\ncar plate Number change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderTotalBills(int id,double totalBills){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setTotalBill(totalBills);
                    System.out.print("\ntotal bills Number change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderNumberOfDays(int id,int numberOfDays){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setNumberOfDays(numberOfDays);
                    System.out.print("\nnumber of day change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderStartOdometer(int id,double startOdometer){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setStartOdometer(startOdometer);
                    System.out.print("\nstart odometer change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void editOrderEndOdometer(int id,double endOdometer){
        boolean orderNotExist = true;
        for (int i = 0;i<orders.size();i++){
            if(orders.get(i) != null){
                if (orders.get(i).getOrderID() == id){
                    orders.get(i).setEndOdometer(endOdometer);
                    System.out.print("\nend odometer change successfully");
                    break;
                }
            }
        }
        if (orderNotExist)
            System.out.print("\n>>sorry but the order is not exist.");
    }

    public void showMeAllOrder(){
        orders.stream().map(Object::toString).forEach(System.out::println);
    }




    private ArrayList <StringBuffer> customerNotification =new ArrayList<>();

    public void addCustomerNotification(StringBuffer note){
        customerNotification.add(note);
    }

    public void showAllCustomerNotification(){
        for (int i =0;i<customerNotification.size();i++){
            if (customerNotification !=null){
                System.out.println(customerNotification.get(i));
            }
        }
    }
}
