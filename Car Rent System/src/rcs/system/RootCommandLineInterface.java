package rcs.system;

import java.util.InputMismatchException;

public class RootCommandLineInterface extends SupervisorCommandLineInterface {

    private int inputChoiceSotUserRoot(){
        System.out.print("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nHow would you like to show the account?\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n[1]. By username.\n[2]. By availability. \n[3]. By oldest.\n[4]. By type. \n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nplease select choice number.\n{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\nYou:\\>");
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4 )){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceSotUserRoot();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceSotUserRoot();
        }
        return choice;
    }

    private void sortUserScreenRoot(){
        int choice = inputChoiceSotUserRoot();
        if (choice == 1){
            sortAccountByUsername();
            printAllAccount();
        }
        if (choice == 2){
            sortAccountByAvailable();
            printAllAccount();
        }
        if (choice == 3){
            sortAccountByDateCreat();
            printAllAccount();
        }
        if (choice == 4){
            sortAccountByType();
            printAllAccount();
        }
    }

    private void rootAccountEditScreen(){
        System.out.print("\n______________________________________________________________\n\t\t\t\t [1]. Add account.\n\t\t ___________________________________________ \n\t\t\t\t [2]. remove account. \n\t\t ___________________________________________ \n\t\t\t\t [3]. edit user user Name.\n\t\t ___________________________________________ \n\t\t\t\t [4]. edit user password.\n\t\t ___________________________________________ \n\t\t\t\t [5]. edit user name.\n\t\t ___________________________________________ \n\t\t\t\t [6]. edit user gender.\n\t\t ___________________________________________ \n\t\t\t\t [7]. edit user telephone.\n\t\t ___________________________________________ \n\t\t\t\t [8]. edit user email.\n\t\t ___________________________________________ \n\t\t\t\t [9]. edit user availability.\n\t\t ___________________________________________ \n\t\t\t\t [10]. edit customer address .\n\t\t ___________________________________________ \n\t\t\t\t [11]. edit customer age.\n\t\t ___________________________________________ \n\t\t\t\t [12]. edit customer license Validity.\n\t\t ___________________________________________ \n\t\t\t\t [13]. edit customer discount point.\n\t\t ___________________________________________ \n\t\t\t\t [14]. edit account type.\n\t\t ___________________________________________ \n\t\t\t\t [15]. edit supervisor rank.\n\t\t ___________________________________________ \n\t\t\t\t [16]. edit supervisor section.\n\t\t ___________________________________________ \n\t\t\t\t [17]. show me all account.\n\t\t ___________________________________________ \n\t\t\t\t [18]. back.\n______________________________________________________________ \nplease select choice number.\n______________________________________________________________ \nYou:\\>");
    }

    private int inputChoiceRootAccountEditScreen(){
        int choice;
        try{
            choice = input.nextInt();
            if (!(choice==1 || choice == 2 || choice == 3 || choice == 4|| choice == 5|| choice == 6|| choice == 7|| choice == 8|| choice == 9|| choice == 10|| choice == 11|| choice == 12|| choice == 13|| choice == 14|| choice == 15|| choice == 16 || choice == 17 || choice == 18)){
                throw new IllegalArgumentException("\n>>invalid value.");
            }
        }
        catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
            choice = inputChoiceRootAccountEditScreen();
        }
        catch (InputMismatchException e){
            System.out.print("\n>>choice can be only number.");
            input.nextLine();
            choice =inputChoiceRootAccountEditScreen();
        }
        return choice;
    }

    private void rootAccountEditScreenOperation(){
        int choice;
        String yesNo = "y";
        while (yesNo.equalsIgnoreCase("y")){
            rootAccountEditScreen();
            choice = inputChoiceRootAccountEditScreen();
            if (choice ==1){
                String type = inputChoiceSignUpAccountRoot();
                if (type.equalsIgnoreCase("c"))
                signUpCustomer();
                else
                    signUpSupervisor();
            }
            if (choice == 2){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    removeAccount(user);
                }
            }
            if (choice == 3){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    String newUser = verifiedNewUsername(inputNewUsername());
                    setUserNameRoot(user, newUser);
                }
            }
            if (choice == 4){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    setPasswordRoot(user, inputNewPassword());
                }
            }
            if (choice == 5){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    setNameRoot(user, inputName());
                }
            }
            if (choice == 6){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    setGenderRoot(user, inputGender(inputGenderChoice()));
                }
            }
            if (choice == 7){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    setTelefoneRoot(user, inputTelefone());
                }
            }
            if (choice == 8){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    setEmailRoot(user, inputEmail());
                }
            }
            if (choice == 9){
                String user = inputUsernameSupervisor();
                setUserAvailability(user,inputAvailability(inputChoiceAvailability()));
            }
            if (choice == 10){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setAddressRoot(user, inputAddress());
                    } else
                        System.out.print("\n>>its not customer account and have not address option.");
                }
            }
            if (choice == 11){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setAgeRoot(user, inputBirthYear(), inputBirthMonth(), inputBirthDay());
                    } else
                        System.out.print("\n>>its not customer account and have not age option.");
                }
            }
            if (choice == 12){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setLicenseValidity(user, inputLicenseValidity(inputChoiceLicenseValidity()));
                    } else
                        System.out.print("\n>>its not customer account and have not License option.");
                }
            }
            if (choice == 13){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("customer")) {
                        setCustomerDiscountPoint(user, inputDiscountPoint());
                    } else
                        System.out.print("\n>>its not customer account and have not discount point option.");
                }
            }
            if (choice == 14 ){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user))
                    setTypeRoot(user,inputAccountType(inputAccountTypeChoice()));
            }
            if (choice == 15){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("supervisor")) {
                        setRank(user, inputRank());
                    } else
                        System.out.print("\n>>its not supervisor account and have not section option.");
                }
            }
            if (choice == 16){
                String user = inputUsernameSupervisor();
                if (isAccountExist(user)) {
                    if (getType(user).equalsIgnoreCase("supervisor")) {
                        setSection(user, inputSection());
                    } else
                        System.out.print("\n>>its not supervisor account and have not section option.");
                }
            }
            if (choice == 17){
                sortUserScreenRoot();
            }
            if (choice == 18){
                break;
            }
        }
    }

    private void rootEditInformationOperation(String username){
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

    protected void rootOperation(String username){
        int choice ;
        String yesNo="y";
        while (yesNo.equalsIgnoreCase("y")) {
            setAvailable(username);
            supervisorMainScreen(username);
            choice = inputChoiceSupervisorMainScreen();
            if (choice == 1) {
                rootAccountEditScreenOperation();
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
                rootShowAllNotification(username);
            }
            if (choice == 6) {
                SupervisorInputMassage(username);
            }
            if (choice == 7) {
                rootEditInformationOperation(username);
            }
            if (choice == 8) {
                rootPrintToString(username);
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
                }
            }
        }
    }
    
}
