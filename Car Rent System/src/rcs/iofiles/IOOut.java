package rcs.iofiles;

import java.io.*;

public interface IOOut {

    public static void writeAccount(Object o) {
        File file = new File("accounts.dat");
        if (file.exists()) {
            iOOutExistAccount(o);
        } else
            iOOutNewAccount(o);
    }

    private static void iOOutExistAccount(Object o) {
        try (AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(new FileOutputStream("accounts.dat", true)))) {
            out.writeObject(o);
            out.writeStreamHeader();
        } catch (IOException e) {
            System.out.print("\n>> " + e.getMessage() + "\n");
        }
    }

    private static void iOOutNewAccount(Object o) {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("accounts.dat", false)))) {
            out.writeObject(o);
        } catch (IOException e) {
            System.out.print("\n>> " + e.getMessage() + " \n");
        }
    }

    public static void checkToSaveAllAccount() {
        File file = new File("accounts.dat");
        if (file.exists())
            file.delete();
    }

    public static void writeCars(Object o) {
        File file = new File("cars.dat");
        if (file.exists()) {
            iOOutExistCars(o);
        } else
            iOOutNewCars(o);
    }

    private static void iOOutExistCars(Object o) {
        try (AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(new FileOutputStream("cars.dat", true)))) {
            out.writeObject(o);
            out.writeStreamHeader();
        } catch (IOException e) {
            System.out.print("\n>> " + e.getMessage() + "\n");
        }
    }

    private static void iOOutNewCars(Object o) {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("cars.dat", false)))) {
            out.writeObject(o);
        } catch (IOException e) {
            System.out.print("\n>> " + e.getMessage() + " \n");
        }
    }

    public static void checkToSaveAllCars() {
        File file = new File("cars.dat");
        if (file.exists())
            file.delete();
    }

    public static void writeReport(Object o) {
        File file = new File("reports.dat");
        if (file.exists()) {
            iOOutExistReport(o);
        } else
            iOOutNewReport(o);
    }

    private static void iOOutExistReport(Object o) {
        try (AppendingObjectOutputStream out = new AppendingObjectOutputStream(new BufferedOutputStream(new FileOutputStream("reports.dat", true)))) {
            out.writeObject(o);
            out.writeStreamHeader();
        } catch (IOException e) {
            System.out.print("\n>> " + e.getMessage() + "\n");
        }
    }

    private static void iOOutNewReport(Object o) {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("reports.dat", false)))) {
            out.writeObject(o);
        } catch (IOException e) {
            System.out.print("\n>> " + e.getMessage() + " \n");
        }
    }

    public static void checkToSaveAllReport() {
        File file = new File("reports.dat");
        if (file.exists())
            file.delete();
    }
}
