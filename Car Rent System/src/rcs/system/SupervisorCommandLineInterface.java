package rcs.system;


import java.util.InputMismatchException;

public class SupervisorCommandLineInterface extends CustomerCommandLineInterface {

    private void supervisorOrderEditScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. Add Order.\n\t\t ___________________________________________ \n\t\t\t\t [2]. remove order. \n\t\t ___________________________________________ \n\t\t\t\t [3]. edit order car id.\n\t\t ___________________________________________ \n\t\t\t\t [4]. edit order car type.\n\t\t ___________________________________________ \n\t\t\t\t [5]. edit order maker.\n\t\t ___________________________________________ \n\t\t\t\t [6]. edit order car model Name.\n\t\t ___________________________________________ \n\t\t\t\t [7]. edit order car registration Number.\n\t\t ___________________________________________ \n\t\t\t\t [8]. edit order car plate Number.\n\t\t ___________________________________________ \n\t\t\t\t [9]. edit order payment Method.\n\t\t ___________________________________________ \n\t\t\t\t [10]. edit order total Bills.\n\t\t ___________________________________________ \n\t\t\t\t [11]. edit order number Of Days.\n\t\t ___________________________________________ \n\t\t\t\t [12]. edit order start Odometer.\n\t\t ___________________________________________ \n\t\t\t\t [13]. edit order end Odometer.\n\t\t ___________________________________________ \n\t\t\t\t [14]. edit order ID.\n\t\t ___________________________________________ \n\t\t\t\t [15]. show me all order.\n\t\t ___________________________________________ \n\t\t\t\t [16]. back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    private int inputChoiceSupervisorOrderEditScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4|| choice == 5|| choice == 6|| choice == 7|| choice == 8|| choice == 9|| choice == 10|| choice == 11|| choice == 12|| choice == 13|| choice == 14|| choice == 15 || choice == 16)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSupervisorOrderEditScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSupervisorOrderEditScreen();
        }
        return choice;
    }

    void supervisorOrderEditScreenOperation(String username){
        int choice;
        String yesNo = "y";
        while (yesNo.equalsIgnoreCase("y")){
            supervisorOrderEditScreen();
            choice = inputChoiceSupervisorOrderEditScreen();
            if (choice ==1){
                makeOrder(inputUsernameSupervisor());
            }
            if (choice == 2){
                removeOrder(inputUsernameSupervisor(),inputOrderID());
            }
            if (choice == 3){
                editOrderCarID(inputUsernameSupervisor(),inputOrderID(),inputCarID());
            }
            if (choice == 4){
                editCarType(inputUsernameSupervisor(),inputOrderID(),inputCarType(inputChoiceCarType()));
            }
            if (choice == 5){
                editOrderCarMaker(inputUsernameSupervisor(),inputOrderID(),inputCarMaker());
            }
            if (choice == 6){
                editOrderCarModel(inputUsernameSupervisor(),inputOrderID(),inputCarModelName());
            }
            if (choice == 7){
                editOrderCarRegistrationNumber(inputUsernameSupervisor(),inputOrderID(),inputCarRegistrationNumber());
            }
            if (choice == 8){
                editOrderCarPlatENumber(inputUsernameSupervisor(),inputOrderID(),inputCarPlateNumber());
            }
            if (choice == 9){
                editOrderCarPaymentMethod(inputUsernameSupervisor(),inputOrderID(),inputPaymentMethod());
            }
            if (choice == 10){
                editOrderTotalBills(inputUsernameSupervisor(),inputOrderID(),inputTotalBills());
            }
            if (choice == 11){
                editOrderNumberOfDays(inputUsernameSupervisor(),inputOrderID(),inputNumberOfDay());
            }
            if (choice == 12){
                editOrderStartOdometer(inputUsernameSupervisor(),inputOrderID(),inputStartOdometerSupervisor());
            }
            if (choice == 13){
                editOrderEndOdometer(inputUsernameSupervisor(),inputOrderID(),inputEndOdometerSupervisor());
            }
            if (choice == 14 ){
                String user = inputUsernameSupervisor();
                int newId = inputNewOrderID();
                int isUsed = verificationNewOrderID(user,newId);
                if (isUsed != -1) {
                    editOrderID(user,inputOrderID(),newId);
                }
            }
            if (choice == 15){
                showMeAllOrder(inputUsernameSupervisor());
            }
            if (choice == 16){
                writeAllUsersData();
                break;
            }
        }
    }

    private void supervisorCarEditScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. Add car.\n\t\t ___________________________________________ \n\t\t\t\t [2]. remove car. \n\t\t ___________________________________________ \n\t\t\t\t [3]. edit id Car.\n\t\t ___________________________________________ \n\t\t\t\t [4]. edit car type.\n\t\t ___________________________________________ \n\t\t\t\t [5]. edit car maker.\n\t\t ___________________________________________ \n\t\t\t\t [6]. edit model Name.\n\t\t ___________________________________________ \n\t\t\t\t [7]. edit model Year.\n\t\t ___________________________________________ \n\t\t\t\t [8]. edit car number Of Seats.\n\t\t ___________________________________________ \n\t\t\t\t [9]. edit car registration Number.\n\t\t ___________________________________________ \n\t\t\t\t [10]. edit car plate Number.\n\t\t ___________________________________________ \n\t\t\t\t [11]. edit car last Meter Reading.\n\t\t ___________________________________________ \n\t\t\t\t [12]. edit car cost Per Day.\n\t\t ___________________________________________ \n\t\t\t\t [13]. edit car cost Per Km.\n\t\t ___________________________________________ \n\t\t\t\t [14]. edit car status.\n\t\t ___________________________________________ \n\t\t\t\t [15]. show me all cars.\n\t\t ___________________________________________ \n\t\t\t\t [16]. back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    private int inputChoiceSupervisorCarEditScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4|| choice == 5|| choice == 6|| choice == 7|| choice == 8|| choice == 9|| choice == 10|| choice == 11|| choice == 12|| choice == 13|| choice == 14|| choice == 15|| choice == 16)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSupervisorCarEditScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSupervisorCarEditScreen();
        }
        return choice;
    }

    void supervisorCarEditScreenOperation(String username){
        int choice;
        String yesNo = "y";
        while (yesNo.equalsIgnoreCase("y")){
            supervisorCarEditScreen();
            choice = inputChoiceSupervisorCarEditScreen();
            if (choice ==1){
                setCar(inputCarType(inputChoiceCarType()),inputCarMaker(),inputCarModelName(),inputCarYear(),inputCarNumberOfSeats(),inputCarRegistrationNumber(),inputCarPlateNumber(),inputEndOdometerSupervisor(),inputCarCostPerDay(),inputCarCostPerKm(),inputAvailability(inputChoiceAvailability()));
            }
            if (choice == 2){
                setRemoveCar(inputCarID());
            }
            if (choice == 3){
                String id = verifiedCarNewID(inputNewCarID());
                if (!id.equals("exist"))
                    setIDCar(inputCarID(),id);
            }
            if (choice == 4){
                setCarType(inputCarID(),inputCarType(inputChoiceCarType()));
            }
            if (choice == 5){
                setMaker(inputCarID(),inputCarMaker());
            }
            if (choice == 6){
                setModelName(inputCarID(),inputCarModelName());
            }
            if (choice == 7){
                setModelYear(inputCarID(),inputCarYear());
            }
            if (choice == 8){
                setNumberOfSeats(inputCarID(),inputCarNumberOfSeats());
            }
            if (choice == 9){
                setRegistrationNumber(inputCarID(),inputCarRegistrationNumber());
            }
            if (choice == 10){
                setPlateNumber(inputCarID(),inputCarPlateNumber());
            }
            if (choice == 11){
                setMeterReading(inputCarID(),inputEndOdometerSupervisor());
            }
            if (choice == 12){
                setCarCostPerDay(inputCarID(),inputCarCostPerDay());
            }
            if (choice == 13){
                setCarCostPerKm(inputCarID(),inputCarCostPerKm());
            }
            if (choice == 14 ){
                setCarStatus(inputCarID(),inputAvailability(inputChoiceAvailability()));
            }
            if (choice == 15){
                customerShowSortCars(username);
            }
            if (choice == 16){
                writeAllCarData();
                break;
            }
        }
    }

    private void supervisorAccountEditScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. Add customer account.\n\t\t ___________________________________________ \n\t\t\t\t [2]. remove customer account. \n\t\t ___________________________________________ \n\t\t\t\t [3]. edit customer user Name.\n\t\t ___________________________________________ \n\t\t\t\t [4]. edit customer password.\n\t\t ___________________________________________ \n\t\t\t\t [5]. edit customer name.\n\t\t ___________________________________________ \n\t\t\t\t [6]. edit customer gender.\n\t\t ___________________________________________ \n\t\t\t\t [7]. edit customer telephone.\n\t\t ___________________________________________ \n\t\t\t\t [8]. edit customer email.\n\t\t ___________________________________________ \n\t\t\t\t [9]. edit customer availability.\n\t\t ___________________________________________ \n\t\t\t\t [10]. edit customer address .\n\t\t ___________________________________________ \n\t\t\t\t [11]. edit customer age.\n\t\t ___________________________________________ \n\t\t\t\t [12]. edit customer license Validity.\n\t\t ___________________________________________ \n\t\t\t\t [13]. edit customer discount point.\n\t\t ___________________________________________ \n\t\t\t\t [14]. show me all customer account.\n\t\t ___________________________________________ \n\t\t\t\t [15]. back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    private int inputChoiceSupervisorAccountEditScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4|| choice == 5|| choice == 6|| choice == 7|| choice == 8|| choice == 9|| choice == 10|| choice == 11|| choice == 12|| choice == 13|| choice == 14|| choice == 15)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSupervisorAccountEditScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSupervisorAccountEditScreen();
        }
        return choice;
    }

    private int inputChoiceSotUser(){
        System.out.print("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nHow would you like to show the account?\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n[1]. By username.\n[2]. By availability. \n[3]. By oldest. \n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nplease select choice number.\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nYou:\\>");
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 )){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSotUser();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSotUser();
        }
        return choice;
    }

    private void sortUserScreen(String username){
        int choice = inputChoiceSotUser();
        if (choice == 1){
            sortAccountByUsername();
            printAllCustomerAccount();
        }
        if (choice == 2){
            sortAccountByAvailable();
            printAllCustomerAccount();
        }
        if (choice == 3){
            sortAccountByDateCreat();
            printAllCustomerAccount();
        }
    }

    private void supervisorAccountEditScreenOperation(String username){
        int choice;
        String yesNo = "y";
        while (yesNo.equalsIgnoreCase("y")){
            supervisorAccountEditScreen();
            choice = inputChoiceSupervisorAccountEditScreen();
            if (choice ==1){
                signUpCustomer();
            }
            if (choice == 2){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        removeAccount(user);
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 3){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        String newUser = verifiedNewUsername(inputNewUsername());
                        setUserNameRoot(user, newUser);
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 4){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setPasswordRoot(user, inputNewPassword());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 5){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setNameRoot(user, inputName());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 6){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setGenderRoot(user, inputGender(inputGenderChoice()));
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 7){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setTelefoneRoot(user, inputTelefone());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 8){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setEmailRoot(user, inputEmail());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 9){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setUserAvailability(user, inputAvailability(inputChoiceAvailability()));
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 10){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setAddressRoot(user, inputAddress());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 11){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setAgeRoot(user, inputBirthYear(), inputBirthMonth(), inputBirthDay());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 12){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setLicenseValidity(user, inputLicenseValidity(inputChoiceLicenseValidity()));
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 13){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setCustomerDiscountPoint(user, inputDiscountPoint());
                    } else
                        System.out.print("\n>>you cannot accesses to this user.");
                }
            }
            if (choice == 14 ){
                sortUserScreen(username);
            }
            if (choice == 15){
                break;
            }
        }
    }

    void SupervisorInputMassage(String username) {
        StringBuffer report = new StringBuffer();
        System.out.print("\nInput your message. \nYou:\\>");
        String myReport = input.next();
        if (input.hasNextLine()){
            myReport += input.nextLine();
        }
        report.append(myReport);
        report.append(" \\by: "+username);
        sendManagerialMessage(inputUsernameSupervisor(),report);
    }

    void supervisorEditInformationScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. Edit My Name.\n\t\t ___________________________________________ \n\t\t\t\t [2]. Edit my gender.\n\t\t ___________________________________________ \n\t\t\t\t [3]. Edit my telephone.\n\t\t ___________________________________________ \n\t\t\t\t [4]. Edit My e-mail.\n\t\t ___________________________________________ \n\t\t\t\t [5]. Back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    int inputChoiceSupervisorEditInformationScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 || choice == 5)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSupervisorEditInformationScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSupervisorEditInformationScreen();
        }
        return choice;
    }

    private void supervisorEditInformationOperation(String username){
        String yesNo = "y";
        int choice ;
        while (yesNo.equalsIgnoreCase("y")) {
            supervisorEditInformationScreen();
            choice = inputChoiceSupervisorEditInformationScreen();
            if (choice == 1) {
                setNameRoot(username, inputName());
            }
            if (choice == 2) {
                setGenderRoot(username, inputGender(inputGenderChoice()));
            }
            if (choice == 3) {
                setTelefoneRoot(username, inputTelefone());
            }
            if (choice == 4) {
                setEmailRoot(username, inputEmail());
            }
            if (choice == 5) {
                break;
            }
        }
    }

    void supervisorMainScreen(String username){
        System.out.print(",Welcome "+username+", How can i help you in you job. "+"\n______________________________________________________________\n\t\t\t\t [1]. Edit accounts.\n\t\t ___________________________________________ \n\t\t\t\t [2]. Edit cars. \n\t\t ___________________________________________ \n\t\t\t\t [3]. Edit order.\n\t\t ___________________________________________ \n\t\t\t\t [4]. show me customers feedback.\n\t\t ___________________________________________ \n\t\t\t\t [5]. show me my notification.\n\t\t ___________________________________________ \n\t\t\t\t [6]. send massage.\n\t\t ___________________________________________ \n\t\t\t\t [7]. Edit my information.\n\t\t ___________________________________________ \n\t\t\t\t [8]. Show me my information.\n\t\t ___________________________________________ \n\t\t\t\t [9]. log out.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    int inputChoiceSupervisorMainScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4|| choice == 5|| choice == 6|| choice == 7|| choice == 8|| choice == 9)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSupervisorMainScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSupervisorMainScreen();
        }
        return choice;
    }

    public void supervisorOperation(String username){
        int choice ;
        String yesNo="y";
        while (yesNo.equalsIgnoreCase("y")) {
            setAvailable(username);
            supervisorMainScreen(username);
            choice = inputChoiceSupervisorMainScreen();
            if (choice == 1) {
                supervisorAccountEditScreenOperation(username);
            }
            if (choice == 2) {
                supervisorCarEditScreenOperation(username);
            }
            if (choice == 3) {
                supervisorOrderEditScreenOperation(username);
            }
            if (choice == 4) {
                showMeAllReport();
            }
            if (choice == 5) {
                supervisorShowAllNotification(username);
            }
            if (choice == 6) {
                SupervisorInputMassage(username);
            }
            if (choice == 7) {
                supervisorEditInformationOperation(username);
            }
            if (choice == 8) {
                supervisorPrintToString(username);
            }
            if (choice == 9) {
                yesNo = inputYesNoChoice();
                if (yesNo.equalsIgnoreCase("n")) {
                    setUnavailable(username);
                    System.out.print("\nplease be patient until we save all change...");
                    writeAllUsersData();
                    writeAllCarData();
                    writeAllReportList();
                    System.out.println("\nGood bye...");
                    break;
                }
            }
        }
    }

}
