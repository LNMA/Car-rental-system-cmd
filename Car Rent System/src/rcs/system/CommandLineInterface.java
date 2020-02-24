package rcs.system;

import rcs.microDataBase.MyData;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineInterface extends MyData {
   Scanner input = new Scanner(System.in);

    protected void mainMenu(){
        System.out.print("\n:):):):):):):):):):):)> Welcome to Rental Car Service\"RCS\" <(:(:(:(:(:(:(:(:(:(:(:(:(:(: \n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"+ " \n[1]. Sign Up. \"Nice to meet you, If you are not sign up please do it first it is easy.\"  \n[2]. Sign In. \"Hallo ,If you already have an account sign in now.\" \n[3]. change my password. \n[4]. change my Username. \n[5]. exit \n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\nPlease enter the number of choice.\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][] \nYou\\:>");
    }

    protected int inputChoiceMainMenu(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 || choice == 5)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceMainMenu();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceMainMenu();
        }
        return choice;
    }

    protected String inputYesNoChoice() {
        String yesNo = null;
        try {
            System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n| Would you like to perform a new operation.  | \n|                                             | \n| <Y>es, I would        <N>o, thanks          |\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \nYou:\\>");
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

    String inputChoiceSignUpAccountRoot(){
        System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nWhat type of account would you like to create?\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n[C]ustomer account.\n[S]upervisor account.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nplease select choice character.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~root:\\>");
        String choice;
        try{
            choice = input.next();
            if (input.hasNextLine())
                choice += input.nextLine();
            if (!(choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("S")))
                throw new IllegalArgumentException("\n>>please select [c] or [s].");
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            choice = inputChoiceSignUpAccountRoot();
        }
        return choice;
    }

    protected String inputUsername(){
        System.out.print("\n>>Please input your username. \nYou:\\>");
        String username =null;
        try{
         username = input.next();
        if (input.hasNextLine())
            username += input.nextLine();
        if (username.contains(" "))
            throw new IllegalArgumentException("\n>>Username cannot contain Whitespace.");
       }
       catch (IllegalArgumentException e) {
           System.out.print(e.getMessage());
           username = inputUsername();
       }
        return username;
    }

    String inputUsernameSupervisor(){
        System.out.print("\n>>Please input username. \nYou:\\>");
        String username =null;
        try{
            username = input.next();
            if (input.hasNextLine())
                username += input.nextLine();
            if (username.contains(" "))
                throw new IllegalArgumentException("\n>>Username cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            username = inputUsernameSupervisor();
        }
        return username;
    }

    String inputUsernameAnotherOnce(){
        System.out.print("\n>>Please input your username another once. \nYou:\\>");
        String username =null;
        try{
            username = input.next();
            if (input.hasNextLine())
                username += input.nextLine();
            if (username.contains(" "))
                throw new IllegalArgumentException("\n>>Username cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            username = inputUsernameAnotherOnce();
        }
        return username;
    }

    String inputNewUsername(){
        System.out.print("\n>>Please input your new username. \nYou:\\>");
        String username =null;
        try{
            username = input.next();
            if (input.hasNextLine())
                username += input.nextLine();
            if (username.contains(" "))
                throw new IllegalArgumentException("\n>>Username cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            username = inputNewUsername();
        }
        return username;
    }

    String inputNewUsernameAnotherOnce(){
        System.out.print("\n>>Please input your new username another once. \nYou:\\>");
        String username =null;
        try{
            username = input.next();
            if (input.hasNextLine())
                username += input.nextLine();
            if (username.contains(" "))
                throw new IllegalArgumentException("\n>>Username cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            username = inputNewUsernameAnotherOnce();
        }
        return username;
    }

    protected String inputPassword (){
        System.out.print("\n>>Please input your Password. \nYou:\\>");
        String password = null;
        try{
            password = input.next();
            if (input.hasNextLine())
                password += input.nextLine();
            if (password.contains(" "))
                throw new IllegalArgumentException("\n>>Password cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e){
        System.out.print(e.getMessage());
        password = inputPassword();
        }
        return password;
    }

    String inputPasswordAnotherOnce (){
        System.out.print("\n>>Please input your Password another once. \nYou:\\>");
        String password = null;
        try{
            password = input.next();
            if (input.hasNextLine())
                password += input.nextLine();
            if (password.contains(" "))
                throw new IllegalArgumentException("\n>>Password cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            password = inputPasswordAnotherOnce();
        }
        return password;
    }

    String inputNewPassword (){
        System.out.print("\n>>Please input your new Password. \nYou:\\>");
        String password = null;
        try{
            password = input.next();
            if (input.hasNextLine())
                password += input.nextLine();
            if (password.contains(" "))
                throw new IllegalArgumentException("\n>>Password cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            password = inputNewPassword();
        }
        return password;
    }

    String inputNewPasswordAnotherOnce (){
        System.out.print("\n>>Please input your new Password another once. \nYou:\\>");
        String password = null;
        try{
            password = input.next();
            if (input.hasNextLine())
                password += input.nextLine();
            if (password.contains(" "))
                throw new IllegalArgumentException("\n>>Password cannot contain Whitespace.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            password = inputNewPasswordAnotherOnce();
        }
        return password;
    }

    String inputName(){
        System.out.print("\n>>Please input your name. \nYou:\\>");
        String name = input.next();
        if (input.hasNextLine())
            name += input.nextLine();
        return name;
    }

    String inputAddress(){
        System.out.print("\n>>Please input your Address. \nYou:\\>");
        String address = input.next();
        if (input.hasNextLine())
            address += input.nextLine();
        return address;
    }

    int inputOrderID(){
        System.out.print("\n>>Please input order id. \nYou:\\>");
        int id = 0;
        try{
            id = input.nextInt();
            if (id < 0)
                throw new IllegalArgumentException("\n>>oder id cannot be negative.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            id = inputOrderID();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>oder id can be only a number.");
            input.nextLine();
            id = inputOrderID();
        }
        return id;
    }

    int inputNewOrderID(){
        System.out.print("\n>>Please input new order id. \nYou:\\>");
        int id = 0;
        try{
            id = input.nextInt();
            if (id < 0)
                throw new IllegalArgumentException("\n>>oder id cannot be negative.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            id = inputNewOrderID();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>oder id can be only a number.");
            input.nextLine();
            id = inputNewOrderID();
        }
        return id;
    }

    String inputChoiceLicenseValidity(){
        System.out.print("\n>>Please select customer License Validity: \n[I]nvalid. \n[V]alid. \nYou:\\>");
        String choice = null;
        try{
            choice = input.next();
            if (input.hasNextLine())
                choice += input.nextLine();
            if (!(choice.equalsIgnoreCase("i") || choice.equalsIgnoreCase("v")))
                throw new IllegalArgumentException("\n>>invalid value, please input [I] Or [V].");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceLicenseValidity();
        }
        return choice;
    }

    boolean inputLicenseValidity(String licenseValidity ){
        if (licenseValidity.equalsIgnoreCase("v"))
            return true;
        else
            return false;
    }

    String inputAccountTypeChoice(){
        System.out.print("\n>>Please account type: \n[C]ustomer. \n[S]upervisor \n[R]oot. \nYou:\\>");
        String choice = null;
        try{
            choice = input.next();
            if (input.hasNextLine())
                choice += input.nextLine();
            if (!(choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("S") || choice.equalsIgnoreCase("R")))
                throw new IllegalArgumentException("\n>>invalid value, please input [C] Or [S] Or [R].");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputAccountTypeChoice();
        }
        return choice;
    }

    String inputAccountType(String accountType){
        if (accountType.equalsIgnoreCase("c"))
            return "customer";
        if (accountType.equalsIgnoreCase("s"))
            return "supervisor";
        else
            return "root";
    }

    String inputGenderChoice(){
        System.out.print("\n>>Please select your gender: \n[M]ale. \n[F]emale. \nYou:\\>");
       String choice = null;
        try{
            choice = input.next();
            if (input.hasNextLine())
                choice += input.nextLine();
            if (!(choice.equalsIgnoreCase("m") || choice.equalsIgnoreCase("f")))
                throw new IllegalArgumentException("\n>>invalid value, please input [F] Or [M].");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputGenderChoice();
        }
        return choice;
    }

    String inputGender(String genderChoice){
        if (genderChoice.equalsIgnoreCase("m"))
            return "Male";
        else
            return "Female";
    }

    int inputBirthYear(){
        System.out.print("\n>>Please input your Birth year: . \nYou:\\>");
        int year =0;
        try{
            year = input.nextInt();
            if (year < 1900)
                throw new IllegalArgumentException("\n>>You cannot be a live now!!.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            year = inputBirthYear();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>birth year can be only a number.");
            input.nextLine();
            year = inputBirthYear();
        }
        return year;
    }

    int inputBirthMonth(){
        System.out.print("\n>>Please input your Birth month: . \nYou:\\>");
        int month =0;
        try{
            month = input.nextInt();
            if (month > 12 || month<1)
                throw new IllegalArgumentException("\n>>month must be 1 - 12!!.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            month = inputBirthMonth();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>birth month can be only a number.");
            input.nextLine();
            month = inputBirthMonth();
        }
        return month;
    }

    int inputBirthDay(){
        System.out.print("\n>>Please input your Birth day: . \nYou:\\>");
        int day =0;
        try{
            day = input.nextInt();
            if (day > 31 || day <1)
                throw new IllegalArgumentException("\n>>day must 1 - 31/28!!.");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            day = inputBirthDay();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>birth day can be only a number.");
            input.nextLine();
            day = inputBirthDay();
        }
        return day;
    }

    String inputTelefone(){
        System.out.print("\n>>Please input your telefone number. \nYou:\\>");
        String telefone = input.next();
        if (input.hasNextLine())
            telefone += input.nextLine();
        return telefone;
    }

    String inputEmail(){
        System.out.print("\n>>Please input your e-mail. \nYou:\\>");
        String email = input.next();
        if (input.hasNextLine())
            email += input.nextLine();
        return email;
    }

    String inputSection(){
        System.out.print("\n>>Please input Supervisor section. \nYou:\\>");
        String section = input.next();
        if (input.hasNextLine())
            section += input.nextLine();
        return section;
    }

    String inputRank(){
        System.out.print("\n>>Please input Supervisor rank. \nYou:\\>");
        String rank = input.next();
        if (input.hasNextLine())
            rank += input.nextLine();
        return rank;
    }

    protected void signature(){
        System.out.println(" ______\n|      |\t\t\t\t\t\t\t          \t\t\t\t     \t\t\t  \n|      |\t\t\t\t _______________\t\t____\t     ____  \t\t\t __________ \t\t    ____\t\t ____\n|      |\t\t\t\t/\t\t\t\t\\      |    |       |\t |\t\t    /    __    \\\t\t   |    |       |    |\n|      |    \t\t   |     _______\t |     |    |       |\t |    \t   /    /  \\    \\\t\t   |    |       |    |\n|      |\t\t       |    |       |\t |     |    |       |\t |     \t  /    /    \\    \\\t\t   |    |       |    |\n|      |\t\t       |    |\t    |\t |     |    |\t    |\t |\t\t /    /______\\    \\\t\t   |    |       |    |\n|      |________       |    |\t    |\t |     |    |\t    |\t | \t\t/    __________    \\\t   |    |       |    |\n|               |      |    |_______|\t |     |    |_______|\t |     /    /          \\    \\ \t   |    |_______|    |\n|               |      |   \t\t\t\t |     |   \t\t\t\t |    /    /  \t\t    \\    \\     |                 |\n|_______________| \t\t\\_______________/\t\t\\_______________/ \t /____/\t\t\t     \\____\\    \\___________      |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|    |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |    |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        |    |\n ______________________________________________________________________________________________________________/     |\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     |\n|___________________________________________________________________________________________________________________/");
    }

    protected void signUpCustomer(){
        setCustomer(verifiedNewUsername(inputUsername()),verifiedInputPassword(),inputName(),inputGender(inputGenderChoice()),inputBirthYear(),inputBirthMonth(),inputBirthDay(),inputTelefone(),inputEmail(),inputAddress());
    }

    void signUpSupervisor(){
        setSupervisor(verifiedNewUsername(inputUsername()),verifiedInputPassword(),inputName(),inputGender(inputGenderChoice()),inputTelefone(),inputEmail(),inputSection(),inputRank());
    }

    protected void signUpRoot(){
        setRoot();
    }

    String verifiedInputPassword(){
        String first = null;
        String second = null;
        try{
            first = inputPassword();
            second = inputPasswordAnotherOnce();
            if (!first.equals(second))
                throw new IllegalArgumentException("\npassword you already enter did not match");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            second = verifiedInputPassword();
        }
        return second;
    }

    String verifiedInputNewPassword(){
        String first = null;
        String second = null;
        try{
            first = inputNewPassword();
            second = inputNewPasswordAnotherOnce();
            if (!first.equals(second))
                throw new IllegalArgumentException("\n>>password you already enter did not match");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            second = verifiedInputNewPassword();
        }
        return second;
    }

    String verifiedInputUsername(){
        String first = null;
        String second = null;
        try{
            first = inputUsername();
            second = inputUsernameAnotherOnce();
            if (!first.equalsIgnoreCase(second))
                throw new IllegalArgumentException("\n>>username you already enter did not match");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            second = verifiedInputUsername();
        }
        return second;
    }

    public String verifiedInputNewUsername(){
        String first = null;
        String second = null;
        try{
            first = inputNewUsername();
            second = inputNewUsernameAnotherOnce();
            if (!first.equalsIgnoreCase(second))
                throw new IllegalArgumentException("\nusername you already enter did not match");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            second = verifiedInputNewUsername();
        }
        return second;
    }

    protected void changePassword(){
        String oldPass;
        int usernameIndex = getUsernameIndex(inputUsername());
        if (usernameIndex != -1) {
            oldPass = verifiedInputPassword();
            if (isThisMyPassword(usernameIndex, oldPass)){
                setPasswordAllByIndex(usernameIndex,verifiedInputNewPassword());
            }
        }
    }

    protected void changeUserName(){
        String oldUsername;
        String password;
        oldUsername = verifiedInputUsername();
        int userNameIndex = getUsernameIndex(oldUsername);
        if (userNameIndex != -1){
            password = verifiedInputPassword();
            if (isThisMyPassword(userNameIndex,password)){
                setUsernameAllByIndex(userNameIndex,verifiedNewUsername(verifiedInputNewUsername()));
            }
        }
    }

    String inputPaymentMethod(){
        System.out.print("\n>>What is payment method would you like: \nYou:\\>");
        String paymentMethod = input.next();
        if (input.hasNextLine())
            paymentMethod += input.nextLine();
        return paymentMethod;
    }

    String inputCarID(){
        System.out.print("\n>>please input car ID: \nYou:\\>");
        String carID = input.next();
        if (input.hasNextLine())
            carID += input.nextLine();
        return carID;
    }

    String inputNewCarID(){
        System.out.print("\n>>please input New car ID: \nYou:\\>");
        String carID = input.next();
        if (input.hasNextLine())
            carID += input.nextLine();
        return carID;
    }

    int inputCarYear(){
        int year;
        System.out.print("\n>>please input car model year. \nYou:\\>");
        try{
            year = input.nextInt();
            if (year < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            year = inputCarYear();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>car year can be only integer number.");
            input.nextLine();
            year =inputCarYear();
        }
        return year;
    }

    int inputCarNumberOfSeats(){
        int seats;
        System.out.print("\n>>please input car Number Of Seats \nYou:\\>");
        try{
            seats = input.nextInt();
            if (seats < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            seats = inputCarNumberOfSeats();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>Number Of Seats can be only integer number.");
            input.nextLine();
            seats =inputCarNumberOfSeats();
        }
        return seats;
    }

    double inputCarCostPerDay(){
        double cost;
        System.out.print("\n>>please input car cost per day. \nYou:\\>");
        try{
            cost = input.nextDouble();
            if (cost < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            cost = inputCarCostPerDay();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>cost per day can be only integer number.");
            input.nextLine();
            cost =inputCarCostPerDay();
        }
        return cost;
    }

    double inputCarCostPerKm(){
        double cost;
        System.out.print("\n>>please input car cost per km. \nYou:\\>");
        try{
            cost = input.nextDouble();
            if (cost < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            cost = inputCarCostPerKm();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>cost per km can be only integer number.");
            input.nextLine();
            cost =inputCarCostPerKm();
        }
        return cost;
    }

    String inputCarMaker(){
        System.out.print("\n>>please input car maker: \nYou:\\>");
        String carMaker = input.next();
        if (input.hasNextLine())
            carMaker += input.nextLine();
        return carMaker;
    }

    String inputCarModelName(){
        System.out.print("\n>>please input car Model Name: \nYou:\\>");
        String carModel = input.next();
        if (input.hasNextLine())
            carModel += input.nextLine();
        return carModel;
    }

    String inputCarRegistrationNumber(){
        System.out.print("\n>>please input car registration Number: \nYou:\\>");
        String carRegistration = input.next();
        if (input.hasNextLine())
            carRegistration += input.nextLine();
        return carRegistration;
    }

    String inputCarPlateNumber(){
        System.out.print("\n>>please input car plate Number: \nYou:\\>");
        String carPlate = input.next();
        if (input.hasNextLine())
            carPlate += input.nextLine();
        return carPlate;
    }

    String inputChoiceCarType(){
        System.out.print("\n>>Please select car type: \n[C]ompact. \n[S]edan. \n[V]an. \nYou:\\>");
        String choice = null;
        try{
            choice = input.next();
            if (input.hasNextLine())
                choice += input.nextLine();
            if (!(choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("s")|| choice.equalsIgnoreCase("v")))
                throw new IllegalArgumentException("\n>>invalid value, please input [s] Or [v] Or [c].");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceCarType();
        }
        return choice;
    }

    String inputCarType(String carType){
        if (carType.equalsIgnoreCase("c"))
            return "compact";
        if (carType.equalsIgnoreCase("s"))
            return "sedan";
        else
            return "van";
    }

    String inputChoiceAvailability(){
        System.out.print("\n>>Please select status: \n[A]vailable. \n[U]navailable. \nYou:\\>");
        String choice = null;
        try{
            choice = input.next();
            if (input.hasNextLine())
                choice += input.nextLine();
            if (!(choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("u")))
                throw new IllegalArgumentException("\n>>invalid value, please input [a] Or [u].");
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceAvailability();
        }
        return choice;
    }

    String inputAvailability(String availability){
        if (availability.equalsIgnoreCase("a"))
            return "available";
        else
            return "unavailable";
    }

    double inputTotalBills(){
        double total;
        System.out.print("\n>>please input total bills. \nYou:\\>");
        try{
            total = input.nextDouble();
            if (total < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            total = inputTotalBills();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>total bills can be only integer number.");
            input.nextLine();
            total =inputTotalBills();
        }
        return total;
    }

    int inputNumberOfDay(){
        int day;
        System.out.print("\n>>how long you want to rent the car(day). \nYou:\\>");
        try{
            day = input.nextInt();
            if (day < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            day = inputNumberOfDay();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>day can be only integer number.");
            input.nextLine();
            day =inputNumberOfDay();
        }
        return day;
    }

    double inputEndOdometer(){
        double endOdometer;
        System.out.print("\n>>please input journey distance (km). \nYou:\\>");
        try{
            endOdometer = input.nextDouble();
            if (endOdometer < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            endOdometer = inputEndOdometer();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>meter can be only number.");
            input.nextLine();
            endOdometer =inputEndOdometer();
        }
        return endOdometer;
    }

    double inputStartOdometerSupervisor(){
        double startOdometer;
        System.out.print("\n>>please input start odometer \nYou:\\>");
        try{
            startOdometer = input.nextDouble();
            if (startOdometer < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            startOdometer = inputStartOdometerSupervisor();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>start odometer can be only integer number.");
            input.nextLine();
            startOdometer =inputStartOdometerSupervisor();
        }
        return startOdometer;
    }

    double inputEndOdometerSupervisor(){
        double endOdometer;
        System.out.print("\n>>please input end Odometer. \nYou:\\>");
        try{
            endOdometer = input.nextDouble();
            if (endOdometer < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            endOdometer = inputEndOdometerSupervisor();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>end meter can be only number.");
            input.nextLine();
            endOdometer =inputEndOdometerSupervisor();
        }
        return endOdometer;
    }

    int inputDiscountPoint(){
        int point;
        System.out.print("\n>>please input discount point. \nYou:\\>");
        try{
            point = input.nextInt();
            if (point < 0){
                throw new IllegalArgumentException("\n>>you cannot input negative value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            point = inputDiscountPoint();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>point can be only integer number.");
            input.nextLine();
            point =inputDiscountPoint();
        }
        return point;
    }

    protected String signIn(String username, String password){
        String type = null;
        if (signInAll(username,password))
            type = getType(username);
        return type;
    }
}
