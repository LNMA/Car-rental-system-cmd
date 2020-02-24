package rcs.system;


import java.util.InputMismatchException;

public class CustomerCommandLineInterface extends CommandLineInterface {

    private void customerEditInformationScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. Edit My Name.\n\t\t ___________________________________________ \n\t\t\t\t [2]. Edit my gender.\n\t\t ___________________________________________ \n\t\t\t\t [3]. Edit my telephone.\n\t\t ___________________________________________ \n\t\t\t\t [4]. Edit My e-mail.\n\t\t ___________________________________________ \n\t\t\t\t [5]. Edit my age.\n\t\t ___________________________________________ \n\t\t\t\t [6]. Edit my address.\n\t\t ___________________________________________ \n\t\t\t\t [7]. Back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    private int inputChoiceCustomerEditInformationScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceCustomerEditInformationScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceCustomerEditInformationScreen();
        }
        return choice;
    }

    private void customerEditInformationOperation(String username){
        String yesNo = "y";
        int choice ;
        while (yesNo.equalsIgnoreCase("y")) {
            customerEditInformationScreen();
            choice = inputChoiceCustomerEditInformationScreen();
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
                setAgeRoot(username, inputBirthYear(), inputBirthMonth(), inputBirthDay());
            }
            if (choice == 6) {
                setAddressRoot(username, inputAddress());
            }
            if (choice == 7) {
                break;
            }
        }
    }

    private void customerShowMyInformation(String username){
        customerPrintToString(username);
    }

    private void customerInputReport(String username) {
        StringBuffer report = new StringBuffer();
        System.out.print("\nwhat is the problem. \nYou:\\>");
        String myReport = input.next();
        if (input.hasNextLine()){
            myReport += input.nextLine();
        }
        report.append(myReport);
        report.append("\\ by: "+username);
        addReport(report);
        System.out.print("\nThank you for your feedback we will look at your notification as fast as possible.");
    }

    private int customerInputChoiceSotCars(){
        System.out.print("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nHow would you like to show the cars?\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n[1]. By type.\n[2]. By price per day. \n[3]. By price per km. \n[4]. By availability. \n[5]. By car ID.\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nplease select choice number.\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nYou:\\>");
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 || choice == 5)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = customerInputChoiceSotCars();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =customerInputChoiceSotCars();
        }
        return choice;
    }

    void customerShowSortCars(String username){
        int choice = customerInputChoiceSotCars();
        if (choice == 1){
            sortCarsByType();
            printAllCars();
        }
        if (choice == 2){
            sortCarsByPerDayPrice();
            printAllCars();
        }
        if (choice == 3){
            sortCarsByPerKmPrice();
            printAllCars();
        }
        if (choice == 4){
            sortCarsByAvailability();
            printAllCars();
        }
        if (choice == 5){
            sortCarsByID();
            printAllCars();
        }
    }

    private String inputYesNoUseDiscountPoint() {
        String yesNo = null;
        try {
            System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n| <Y>es, I would        <N>o, thanks          |\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \nYou:\\>");
            yesNo = input.next();
            if (input.hasNextLine()) {
                yesNo += input.nextLine();
            }
            if (!(yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("y"))) {
                throw new IllegalArgumentException("\n######################################### \n You are enter invalid value...try again \n#########################################\n");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            yesNo =  inputYesNoChoice();
        }
        return yesNo;
    }

    void makeOrder(String username){
        String id = inputCarID();
        String carType;
        double point = getDiscountPoint(username);
        String yesNo;
        double startOdometer;
        double endOdometer;
        if (isCarExist(id)){
            if (getCarStatus(id).equals("available")){
                if (getLicenseValidity(username)){
                    carType = getCarType(id);
                    if (carType.equalsIgnoreCase("compact")){
                        startOdometer = getCarLastOdometer(id);
                        endOdometer = startOdometer+inputEndOdometer();
                        setCompactOrder(username,id,carType,getCarMaker(id),getCarModel(id),getCarRegistration(id),getCarPlate(id),inputPaymentMethod(),inputNumberOfDay(),startOdometer,endOdometer,getCarPerDayPrice(id),getCarPerKmPrice(id));
                        setMeterReading(id,endOdometer);
                        setCarStatusUnavailable(id);
                        if (point>0) {
                            System.out.print("\n>>Would you like to use your discount point");
                            yesNo = inputYesNoUseDiscountPoint();
                            if (yesNo.equalsIgnoreCase("y")) {
                                useMyDiscount(username,inputDiscountPoint());
                            }
                        }
                    }
                    if (carType.equalsIgnoreCase("sedan")){
                        startOdometer = getCarLastOdometer(id);
                        endOdometer = startOdometer+inputEndOdometer();
                        setSedanCarOrder(username,id,carType,getCarMaker(id),getCarModel(id),getCarRegistration(id),getCarPlate(id),inputPaymentMethod(),inputNumberOfDay(),startOdometer,endOdometer,getCarPerDayPrice(id),getCarPerKmPrice(id));
                        setMeterReading(id,endOdometer);
                        setCarStatusUnavailable(id);
                        if (point>0) {
                            System.out.print("\n>>Would you like to use your discount point");
                            yesNo = inputYesNoUseDiscountPoint();
                            if (yesNo.equalsIgnoreCase("y")) {
                                useMyDiscount(username,inputDiscountPoint());
                            }
                        }
                    }
                    if (carType.equalsIgnoreCase("van")){
                        startOdometer = getCarLastOdometer(id);
                        endOdometer = startOdometer+inputEndOdometer();
                        setVanCarOrder(username,id,carType,getCarMaker(id),getCarModel(id),getCarRegistration(id),getCarPlate(id),inputPaymentMethod(),inputNumberOfDay(),startOdometer,endOdometer,getCarPerDayPrice(id),getCarPerKmPrice(id));
                        setMeterReading(id,endOdometer);
                        setCarStatusUnavailable(id);
                        if (point>0) {
                            System.out.print("\n>>Would you like to use your discount point");
                            yesNo = inputYesNoUseDiscountPoint();
                            if (yesNo.equalsIgnoreCase("y")) {
                                useMyDiscount(username,inputDiscountPoint());
                            }
                        }
                    }
                }else
                    System.out.print("\nyour License now is out-of-date please contact our team to solve this problem.");
            }else
                System.out.println("\n>>sorry the car now is unavailable.");
        }else
            System.out.println("\n>>no car have this id.");
    }

    private void useMyDiscountPointRentalScreen(String username){
        useMyDiscount(username,inputDiscountPoint());
    }

    private int rentalScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. show me cars.\n\t\t ___________________________________________ \n\t\t\t\t [2]. make a rent order. \n\t\t ___________________________________________ \n\t\t\t\t [3]. Use my discount point.\n\t\t ___________________________________________ \n\t\t\t\t [4]. back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 )){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = rentalScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =rentalScreen();
        }
        return choice;
    }

    private void rentalScreenOperation(String username){
        int choice ;
        String yeaNo = "y";
        while (yeaNo.equalsIgnoreCase("y")) {
            choice = rentalScreen();
            if (choice == 1) {
                customerShowSortCars(username);
            }
            if (choice == 2) {
                makeOrder(username);
            }
            if (choice == 3) {
                useMyDiscountPointRentalScreen(username);
            }
            if (choice == 4) {
                break;
            }
        }
    }

    private void customerScreenMenu(String username){
        System.out.print(",Welcome "+username+", How can we serve you.\n______________________________________________________________\n\t\t\t\t [1]. Edit My information.\n\t\t ___________________________________________ \n\t\t\t\t [2]. Show me my Information.\n\t\t ___________________________________________ \n\t\t\t\t [3]. Report for Problem.\n\t\t ___________________________________________ \n\t\t\t\t [4]. show me my notification.\n\t\t ___________________________________________ \n\t\t\t\t [5]. Rental Screen.\n\t\t ___________________________________________ \n\t\t\t\t [6]. log out.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________  \nYou:\\>");
    }

    private int inputChoiceCustomerScreenMenu(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceCustomerScreenMenu();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceCustomerScreenMenu();
        }
        return choice;
    }

    protected void customerOperation(String username){
        int choice ;
        String yesNo="y";
        while (yesNo.equalsIgnoreCase("y")) {
            setAvailable(username);
            customerScreenMenu(username);
            choice = inputChoiceCustomerScreenMenu();
            if (choice == 1) {
                customerEditInformationOperation(username);
            }
            if (choice == 2) {
                customerShowMyInformation(username);
            }
            if (choice == 3) {
                customerInputReport(username);
            }
            if (choice == 4) {
                customerShowAllNotification(username);
            }
            if (choice == 5) {
                rentalScreenOperation(username);
            }
            if (choice == 6) {
                yesNo = inputYesNoChoice();
                if (yesNo.equalsIgnoreCase("n")) {
                    setUnavailable(username);
                    System.out.print("\nplease be patient until we save all change...");
                    writeAllUsersData();
                    writeAllCarData();
                    writeAllReportList();
                    System.out.println("\nGood bye...");
                }
            }
        }
    }

}
