package rcs.iofiles;

import rcs.cars.Car;
import rcs.system.RootCommandLineInterface;
import rcs.user.User;

import java.io.*;

public class IOIn extends RootCommandLineInterface {
    public IOIn() {

    }

    public void iOInAccounts() {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("accounts.dat")))) {
            while (true) {
                addAllUser((User) in.readObject());
            }
        }
        catch (EOFException e) {
            System.out.print("\n>>all users data was read successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.print("\n>>" + e.getMessage() + ".\n");
        }
    }

    public void iOCar() {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("cars.dat")))) {
            while (true) {
                addAllCar((Car) in.readObject());
            }
        }
        catch (EOFException e) {
            System.out.print("\n>>all car data was read successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.print("\n>>" + e.getMessage() + ".\n");
        }
    }

    public void iOReport() {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("reports.dat")))) {
            while (true) {
                addAllReport((StringBuffer) in.readObject());
            }
        }
        catch (EOFException e) {
            System.out.print("\n>>all report data was read successfully.\n");
        } catch (IOException | ClassNotFoundException e) {
            System.out.print("\n>>" + e.getMessage() + ".\n");
        }
    }
}
