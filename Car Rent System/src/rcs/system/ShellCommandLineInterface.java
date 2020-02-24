package rcs.system;


import rcs.iofiles.IOIn;

public class ShellCommandLineInterface extends IOIn {


    public void triggerMethod(){
        signature();
        System.out.print("\n>>please wait until we restore all data.");
        iOCar();
        iOInAccounts();
        iOReport();
        setCarSequence(getLargeCarId());
        setOrderSequence(getLargeOrderId());
        System.out.print("done.\n");
        String username ;
        String password ;
        String type;
        String yesNo = "y";
        int choice;
        while (yesNo.equalsIgnoreCase("y")) {
            mainMenu();
            choice = inputChoiceMainMenu();
            if (choice == 1){
                signUpCustomer();
                writeAllUsersData();
            }
            if (choice == 2) {
                username = inputUsername();
                password = inputPassword();
                type = signIn(username, password);
                if (type == null)
                    continue;
                if (type.equals("customer")) {
                    customerOperation(username);
                }
                if (type.equals("supervisor")){
                    supervisorOperation(username);
                }
                if (type.equals("root")){
                    rootOperation(username);
                }
            }
            if (choice == 3){
                changePassword();
            }
            if (choice == 4){
                changeUserName();
            }
            if (choice == 5){
                yesNo = inputYesNoChoice();
                if (yesNo.equalsIgnoreCase("n")){
                    System.out.print("\nplease be patient until we save all change...");
                    writeAllUsersData();
                    writeAllCarData();
                    writeAllReportList();
                    System.out.println("\nGood bye...");
                    signature();
                    System.exit(0);
                }
            }
        }
    }
}
