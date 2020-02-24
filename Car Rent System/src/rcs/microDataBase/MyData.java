package rcs.microDataBase;

import rcs.cars.Car;
import rcs.order.RentalOrder;
import rcs.user.*;
import rcs.userList.*;
import rcs.system.*;
import rcs.iofiles.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class MyData implements Serializable {

    private ArrayList<Car> cars = new ArrayList<>();

    protected String getLargeCarId(){
        String temp;
        String max = "0";
        for (int i = 0;i<cars.size();i++){
            if (cars.get(i) != null){
                if (cars.get(i).getIdCar() != null) {
                    temp = cars.get(i).getIdCar();
                    if (temp.compareToIgnoreCase(max) > 0) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    protected static void setCarSequence(String largeCarID){
        Car.setSequence(Integer.parseInt(largeCarID));
    }

    protected void addAllCar(Car car){
        cars.add(car);
    }

    protected void writeAllCarData(){
        IOOut.checkToSaveAllCars();
        for (Car car:cars) {
            IOOut.writeCars(car);
        }
    }

    protected void setCar(String carType, String maker, String modelName, int modelYear, int numberOfSeats, String registrationNumber, String plateNumber, double lastMeterReading, double costPerDay, double costPerKm, String status) {
        cars.add(new Car( carType,  maker,  modelName,  modelYear,  numberOfSeats,  registrationNumber,  plateNumber,  lastMeterReading,  costPerDay,  costPerKm,  status));
        IOOut.writeCars(cars.get(cars.size()-1));
    }

    protected String verifiedCarNewID(String newID) {
        boolean exist = false;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(newID)) {
                    if (newID.equals("exist")) {
                        System.out.print("\n>>There already car have this id.");
                        exist = true;
                    }
                }
            }
        }
        if (exist){
            return "exist";
        }else {
            return newID;
        }
    }

    protected void setIDCar(String oldID, String newID) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(oldID)) {
                    car.setIdCar(newID);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change id to: " + newID);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setCarType(String id, String carType) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setCarType(carType);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change car Type to: " + carType);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setMaker(String id, String maker) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setMaker(maker);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully maker Type to: " + maker);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setModelName(String id, String modelName) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setModelName(modelName);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully model Name to: " + modelName);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setModelYear(String id, int modelYear) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setModelYear(modelYear);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully model Name to: " + modelYear);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setNumberOfSeats(String id, int numberOfSeats) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setNumberOfSeats(numberOfSeats);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully number Of Seats to: " + numberOfSeats);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setRegistrationNumber(String id, String newRegistrationNumber) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setRegistrationNumber(newRegistrationNumber);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change Registration Number to: " + newRegistrationNumber);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setPlateNumber(String id, String newPlateNumber) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setPlateNumber(newPlateNumber);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change Plate Number to: " + newPlateNumber);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setCarStatusAvailable(String id) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setStatus("available");
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change status");
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setCarStatusUnavailable(String id) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setStatus("unavailable");
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change status");
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setCarStatus(String id,String status) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setStatus(status);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully change status");
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setMeterReading(String id, double lastMeterReading) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setLastMeterReading(lastMeterReading);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully lastMeter Reading to: " + lastMeterReading);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setCarCostPerDay(String id, double costPerDay) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setCostPerDay(costPerDay);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully Cost Per Day to: " + costPerDay);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setCarCostPerKm(String id, double costPerKm) {
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    car.setCostPerKm(costPerKm);
                    System.out.print("\n>>the car which have id: " + car.getIdCar() + " ,and maker: " + car.getMaker() + " ,Model: " + car.getModelName() + " ,model year: " + car.getModelYear() + " ,type: " + car.getCarType() + " ,plate number: " + car.getPlateNumber() + " ,Registration Number: " + car.getRegistrationNumber() + " --> successfully cost Per Km to: " + costPerKm);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected void setRemoveCar(String id) {
        boolean notExist = true;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null) {
                if (cars.get(i).getIdCar().equals(id)) {
                    System.out.print("\n>>the car which have id: " + cars.get(i).getIdCar() + " ,and maker: " + cars.get(i).getMaker() + " ,Model: " + cars.get(i).getModelName() + " ,model year: " + cars.get(i).getModelYear() + " ,type: " + cars.get(i).getCarType() + " ,plate number: " + cars.get(i).getPlateNumber() + " ,Registration Number: " + cars.get(i).getRegistrationNumber() + " --> successfully removed!!");
                    cars.remove(i);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
    }

    protected boolean isCarExist(String id){
        boolean notExist = true;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected String getCarType(String id) {
        boolean notExist = true;
        String carType = null;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    carType = car.getCarType();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return carType;
    }

    protected String getCarMaker(String id) {
        boolean notExist = true;
        String car = null;
        for (Car value : cars) {
            if (value != null) {
                if (value.getIdCar().equals(id)) {
                    car = value.getMaker();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return car;
    }

    protected String getCarModel(String id) {
        boolean notExist = true;
        String car = null;
        for (Car value : cars) {
            if (value != null) {
                if (value.getIdCar().equals(id)) {
                    car = value.getModelName();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return car;
    }

    protected String getCarPlate(String id) {
        boolean notExist = true;
        String car = null;
        for (Car value : cars) {
            if (value != null) {
                if (value.getIdCar().equals(id)) {
                    car = value.getPlateNumber();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return car;
    }

    protected String getCarRegistration(String id) {
        boolean notExist = true;
        String car = null;
        for (Car value : cars) {
            if (value != null) {
                if (value.getIdCar().equals(id)) {
                    car = value.getRegistrationNumber();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return car;
    }

    protected double getCarPerDayPrice(String id) {
        boolean notExist = true;
        double carPrice = 0;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    carPrice = car.getCostPerDay();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return carPrice;
    }

    protected double getCarPerKmPrice(String id) {
        boolean notExist = true;
        double carPrice = 0;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    carPrice = car.getCostPerKm();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return carPrice;
    }

    protected double getCarLastOdometer(String id) {
        boolean notExist = true;
        double carMeter = 0;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    carMeter = car.getLastMeterReading();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return carMeter;
    }

    protected String getCarStatus(String id) {
        boolean notExist = true;
        String status = null;
        for (Car car : cars) {
            if (car != null) {
                if (car.getIdCar().equals(id)) {
                    status = car.getStatus();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.println("\n>>No car have this id.");
        return status;
    }

    protected void sortCarsByType(){
        cars.sort(Comparator.comparing(Car::getCarType));
    }

    protected void sortCarsByID(){
        cars.sort(Comparator.comparing(Car::getIdCar));
    }

    protected void sortCarsByPerDayPrice(){
        cars.sort(Comparator.comparingDouble(Car::getCostPerDay));
    }

    protected void sortCarsByPerKmPrice(){
        cars.sort(Comparator.comparingDouble(Car::getCostPerKm));
    }

    protected void sortCarsByAvailability(){
        cars.sort(Comparator.comparing(Car::getStatus));
    }

    protected void printAllCars(){
        cars.stream().map(Object::toString).forEach(System.out::println);
    }






    private ArrayList<User> users = new ArrayList<>();

    protected int getLargeOrderId(){
        int temp = 0;
        int max = 0;
        for (int i = 0;i<users.size();i++){
            if (users.get(i) != null){
                if (users.get(i) instanceof Customer){
                    temp = ((CustomerLists) users.get(i)).getLargeOrderID();
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    protected void setOrderSequence(int sequence){
        RentalOrder.setSequenceOrder(sequence);
    }

    protected void addAllUser(User user){
        users.add(user);
    }

    protected void writeAllUsersData(){
        IOOut.checkToSaveAllAccount();
        for (User user : users) {
            if (user != null) {
                IOOut.writeAccount(user);
            }
        }
    }

    protected void setCompactOrder(String username,String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm){
        for (int i = 0;i<users.size();i++){
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists)users.get(i)).setCompactCarOrder( carID,  carType,  maker,  modelName,  registrationNumber,  plateNumber,  paymentMethod,  numberOfDays,  startOdometer,  endOdometer, costPerDay, costPerKm);
                }
            }
        }
    }

    protected void setSedanCarOrder(String username,String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm){
        for (int i = 0;i<users.size();i++){
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists)users.get(i)).setSedanCarOrder( carID,  carType,  maker,  modelName,  registrationNumber,  plateNumber,  paymentMethod,  numberOfDays,  startOdometer,  endOdometer, costPerDay, costPerKm);
                }
            }
        }
    }

    protected void setVanCarOrder(String username,String carID, String carType, String maker, String modelName, String registrationNumber, String plateNumber, String paymentMethod, int numberOfDays, double startOdometer, double endOdometer,double costPerDay,double costPerKm) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).setVanCarOrder(carID, carType, maker, modelName, registrationNumber, plateNumber, paymentMethod, numberOfDays, startOdometer, endOdometer, costPerDay, costPerKm);
                }
            }
        }
    }

    protected void removeOrder(String username,int OrderId){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).removeOrder(OrderId);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected int verificationNewOrderID(String username,int newID){
        boolean notExist = true;
        int id=0;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists)users.get(i)).verificationNewOrderID(newID);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
        }
        return id;
    }

    protected void editOrderID(String username,int id,int newID){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists)users.get(i)).editOrderID(id,newID);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
        }
    }

    protected void editCarType(String username,int id,String carType){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists)users.get(i)).editCarType(id,carType);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderCarMaker(String username,int id,String carMaker){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists)users.get(i)).editOrderCarMaker(id, carMaker);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderCarModel(String username,int id,String carModel){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderCarModel(id,carModel);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderCarRegistrationNumber(String username,int id,String registrationNumber){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderCarRegistrationNumber(id,registrationNumber);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderCarPlatENumber(String username,int id,String plateNumber){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderCarPlatENumber(id, plateNumber);
                    notExist = false;
                    break;
                }
            }
        }

        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderCarPaymentMethod(String username,int id,String paymentMethod){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderCarPaymentMethod(id,paymentMethod);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderTotalBills(String username,int id,double totalBills){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderTotalBills(id,totalBills);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderNumberOfDays(String username,int id,int numberOfDays){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderNumberOfDays(id, numberOfDays);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderStartOdometer(String username,int id,double startOdometer){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderStartOdometer(id,startOdometer);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderCarID(String username,int id,String newID) {
        boolean notExist = true;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderCarID(id, newID);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void editOrderEndOdometer(String username,int id,double endOdometer){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).editOrderEndOdometer(id,endOdometer);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void showMeAllOrder(String username){
        boolean notExist = true;
        for (int i=0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) users.get(i)).showMeAllOrder();
                    notExist = false;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }




    protected void setCustomer (String userName, String password, String name, String gender, int year,int month,int day,String telefone, String email,String address){
        users.add(new CustomerLists( userName,  password,  name,  gender,  year, month, day, telefone,  email, address));
        IOOut.writeAccount(users.get(users.size()-1));
    }

    protected void setSupervisor(String userName, String password, String name, String gender, String telefone, String email,String section, String rank){
        users.add(new SupervisorNotificationList( userName,  password,  name,  gender,  telefone,  email,  section,  rank));
        IOOut.writeAccount(users.get(users.size()-1));
    }

    protected void setRoot(){
        users.add(new RootDebugList("root", "123456789root", "louay amr", "male", "0096278967203", "louay_amr@outlook.com"));
        IOOut.writeAccount(users.get(users.size()-1));
    }

    protected void setTypeRoot(String username,String newType){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setTypeRoot(newType);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change type to: " + newType);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected String verifiedNewUsername(String newUsername) {
        try {
            for (User user : users) {
                if (user != null) {
                    if (user.getUserName().equalsIgnoreCase(newUsername)) {
                        throw new IllegalArgumentException("\n>>There already account have this username.");
                    }
                }
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            newUsername = verifiedNewUsername(new CommandLineInterface().verifiedInputNewUsername());
        }
        return newUsername;
    }

    protected void setUserNameRoot(String username,String newUsername){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setUserName(newUsername);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change user name to: " + newUsername);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setPasswordRoot(String username,String newPassword){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setPassword(newPassword);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change password to: " + newPassword);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username.");
    }

    protected boolean signInAll(String username,String password){
        boolean userNotExist = true;
        boolean passwordNotExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    userNotExist = false;
                    if (user.getPassword().equals(password)) {
                        passwordNotExist = false;
                        System.out.print("\n>>" + user.getUserName() + " ,Nice to see you again...");
                        return true;
                    }
                }
            }
        }
        if (userNotExist || passwordNotExist)
            System.out.print("\n>>username or password seem wrong.");
        return false;
    }

    protected boolean isAccountExist(String username){
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                        return true;
                    }
                }
            }
        System.out.print("\n>>No account have this username.");
        return false;
    }


    protected void setUsernameAllByIndex(int usernameIndex,String newUsername){
        users.get(usernameIndex).setUserName(newUsername);
        System.out.print("\n>>Account: " + users.get(usernameIndex).getUserName() + " -->username change successfully.");
    }

    protected void setPasswordAllByIndex(int usernameIndex,String newPassword){
        users.get(usernameIndex).setPassword(newPassword);
        System.out.print("\n>>Account: " + users.get(usernameIndex).getUserName() + " -->password change successfully.");
    }

    protected void setNameRoot(String username,String name){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setName(name);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change name to: " + name);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setAgeRoot(String username,int year,int month,int day){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) user).setAge(year, month, day);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->age successfully change to: " + ((CustomerLists) user).getAge());
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setGenderRoot(String username,String gender){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setGender(gender);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change gender to: " + gender);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setEmailRoot(String username,String email){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setEmail(email);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change e-mail to: " + email);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setAddressRoot(String username,String address){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) user).setAddress(address);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change Address to: " + address);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setTelefoneRoot(String username,String telefone){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setTelefone(telefone);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->successfully change telefone to: " + telefone);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void useMyDiscount(String username,int point){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) user).useLoyalty(point);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
        }
    }

    protected void setCustomerDiscountPoint(String username,int point){
        boolean notExist = true;
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((Customer) users.get(i)).setLoyalty(point);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
        }
    }

    protected void setAvailable(String username){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setAvailable("available");
                    System.out.print("\n>>Account: " + user.getUserName() + " -->is available ");
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setRank(String username,String rank){
        boolean notExist = true;
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    if (users.get(i) instanceof Supervisor) {
                        ((Supervisor) users.get(i)).setRank(rank);
                        System.out.print("\n>>Account: " + users.get(i).getUserName() + " -->rank change successfully");
                        notExist = false;
                        break;
                    }
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setSection(String username,String section){
        boolean notExist = true;
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    if (users.get(i) instanceof Supervisor) {
                        ((Supervisor) users.get(i)).setSection(section);
                        System.out.print("\n>>Account: " + users.get(i).getUserName() + " -->section change successfully");
                        notExist = false;
                        break;
                    }
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setUnavailable(String username){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setAvailable("Unavailable");
                    System.out.print("\n>>Account: " + user.getUserName() + " -->is Unavailable ");
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setUserAvailability(String username,String availability){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    user.setAvailable(availability);
                    System.out.print("\n>>Account: " + user.getUserName() + " -->is "+availability);
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void setLicenseValidity(String username,boolean licenseValidity){
        boolean notExist = true;
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((Customer) users.get(i)).setLicenseValidity(licenseValidity);
                    notExist = false;
                    System.out.print("\n>>operation done successfully.");
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
        }
    }

    protected void removeAccount(String username){
        boolean notExist = true;
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null){
                if (users.get(i).getUserName().equalsIgnoreCase(username)){
                   notExist = false;
                    users.remove(i);
                    System.out.print("\n>>account remove successfully");

                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected String getUsername(String username){
        boolean notExist = true;
        String getUsername = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getUsername = user.getUserName();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getUsername;
        }else {
            return getUsername;
        }
    }

    protected int getUsernameIndex(String username){
        boolean notExist = true;
        int getUsernameIndex = -1;
        for (int i = 0;i<users.size();i++){
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    getUsernameIndex = i;
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getUsernameIndex;
        }else {
            return getUsernameIndex;
        }
    }

    protected boolean isThisMyPassword(int usernameIndex , String Password){
        if (users.get(usernameIndex).getPassword().equals(Password)){
            return true;
        }
        else {
            System.out.print("\nwrong password.");
            return false;
        }
    }

    protected String getPassword(String username){
        boolean notExist = true;
        String getPassword = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getPassword = user.getPassword();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getPassword;
        }else {
            return getPassword;
        }
    }

    protected String getName(String username){
        boolean notExist = true;
        String getName = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getName = user.getName();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getName;
        }else {
            return getName;
        }
    }

    protected String getAge(String username){
        boolean notExist = true;
        String getAge = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getAge = ((Customer) user).getAge();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getAge;
        }else {
            return getAge;
        }
    }

    protected String getGender(String username){
        boolean notExist = true;
        String getGender = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getGender = user.getGender();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getGender;
        }else {
            return getGender;
        }
    }

    protected String getAddress(String username){
        boolean notExist = true;
        String getAddress = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getAddress = ((Customer) user).getAddress();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getAddress;
        }else {
            return getAddress;
        }
    }

    protected String getTelefone(String username){
        boolean notExist = true;
        String getTelefone = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getTelefone = user.getTelefone();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getTelefone;
        }else {
            return getTelefone;
        }
    }

    protected String getType(String username){
        boolean notExist = true;
        String getType = null;
        for (int i =0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    getType = users.get(i).getType();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
        return getType;
    }

    protected String getAvailable(String username){
        boolean notExist = true;
        String getAvailable = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getAvailable = user.getAvailable();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getAvailable;
        }else {
            return getAvailable;
        }
    }

    protected boolean getLicenseValidity(String username){
        boolean notExist = true;
        boolean licenseValidity = false;
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    licenseValidity = ((Customer) users.get(i)).isLicenseValidity();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return licenseValidity;
        }else {
            return licenseValidity;
        }
    }

    protected Date getDateCreat(String username){
        boolean notExist = true;
        Date getDateCreat = null;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    getDateCreat = user.getDateCreat();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return getDateCreat;
        }else {
            return getDateCreat;
        }
    }

    protected double getDiscountPoint(String username){
        boolean notExist = true;
        double point = 0;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    point = ((Customer) user).getLoyalty();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist) {
            System.out.print("\n>>No account have this username");
            return point;
        }else {
            return point;
        }
    }

    protected void customerPrintToString(String username){
        boolean notExist = true;
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    if (user instanceof CustomerLists)
                    System.out.println(user);
                    ((CustomerLists)user).showMeAllOrder();
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void supervisorPrintToString(String username){
        boolean notExist = true;
        for (int i= 0;i<users.size();i++) {
            if (users.get(i)!= null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    if (users.get(i) instanceof Supervisor)
                    System.out.println(((Supervisor) users.get(i)).toString());
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void rootPrintToString(String username){
        boolean notExist = true;
        for (int i= 0;i<users.size();i++) {
            if (users.get(i)!= null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    if (users.get(i) instanceof Root)
                        System.out.println(((Root) users.get(i)).toString());
                    notExist = false;
                    break;
                }
            }
        }
        if (notExist)
            System.out.print("\n>>No account have this username");
    }

    protected void sortAccountByUsername(){
        users.sort(Comparator.comparing(User::getUserName));
    }

    protected void sortAccountByType(){
        users.sort(Comparator.comparing(User::getType));
    }

    protected void sortAccountByAvailable(){
        users.sort(Comparator.comparing(User::getAvailable));
    }

    protected void sortAccountByDateCreat(){
        users.sort(Comparator.comparing(User::getDateCreat));
    }

    protected void printAllAccount(){
        users.stream().map(Object::toString).forEach(System.out::println);
    }

    protected void printAllCustomerAccount(){
        for (int i = 0;i<users.size();i++){
            if (users.get(i) != null){
                if (users.get(i) instanceof  Customer){
                    System.out.println(((Customer)users.get(i)).toString());
                }
            }
        }
    }

    protected void supervisorShowAllNotification(String username){
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((SupervisorNotificationList) users.get(i)).showAllNotification();
                }
            }
        }
    }

    protected void rootShowAllNotification(String username){
        for (int i = 0;i<users.size();i++) {
            if (users.get(i) != null) {
                if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                    ((RootDebugList) users.get(i)).showAllNotification();
                }
            }
        }
    }

    protected void sendManagerialMessage(String username,StringBuffer message){
        if (isAccountExist(username)) {
            String type = getType(username);
            if (type.equalsIgnoreCase("supervisor")) {
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i) != null) {
                        if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                            ((SupervisorNotificationList) users.get(i)).setReport(message);
                            break;
                        }
                    }
                }
            }
            if (type.equalsIgnoreCase("root")) {
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i) != null) {
                        if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                            ((RootDebugList) users.get(i)).setReport(message);
                            break;
                        }
                    }
                }
            }
            if (type.equalsIgnoreCase("customer")) {
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i) != null) {
                        if (users.get(i).getUserName().equalsIgnoreCase(username)) {
                            ((CustomerLists) users.get(i)).addCustomerNotification(message);
                            break;
                        }
                    }
                }
            }
            System.out.print("\n>>message sent.");
        }
    }

    protected void customerShowAllNotification(String username){
        for (User user : users) {
            if (user != null) {
                if (user.getUserName().equalsIgnoreCase(username)) {
                    ((CustomerLists) user).showAllCustomerNotification();
                }
            }
        }
    }





    private ArrayList<StringBuffer> reports = new ArrayList<>();

    protected void addAllReport(StringBuffer stringBuffer){
        reports.add(stringBuffer);
    }

    protected void writeAllReportList(){
        IOOut.checkToSaveAllReport();
        for (StringBuffer s : reports) {
            IOOut.writeReport(s);
        }
    }

    protected void addReport(StringBuffer report){
        reports.add(report);
        IOOut.writeReport(reports.get(reports.size()-1));
    }

    protected void showMeAllReport(){
        reports.stream().map(StringBuffer::toString).forEach(System.out::println);
    }

}
