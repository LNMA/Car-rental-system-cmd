package rcs.user;


import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;


public class Customer extends User implements Serializable {
    private String address;
    private String age;
    private boolean licenseValidity;
    private double loyalty;
    private final String USER_TYPE = "customer";

    public Customer(String userName, String password, String name, String gender, int year,int month,int day,String telefone, String email, String address) {
        super(userName, password, name, gender, telefone, email);
        this.address = address;
        setAge( year, month, day);
        setType();
    }


    @Override
    public void setType() {
        super.type = this.USER_TYPE;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(double loyalty) {
        this.loyalty = loyalty;
    }

    public String getAge() {
        return age;
    }

    public void setAge(int year,int month,int day) {
        String myAge = null;
        int myMonth;
        int myYear;
        LocalDate birthDate ;
        LocalDate now ;
        try {
            birthDate = LocalDate.of(year, month, day);
            now = LocalDate.now();
            myYear = birthDate.until(now).getYears();
            myMonth = birthDate.until(now).getMonths();
            int myDay = birthDate.until(now).getDays();
            myAge = myYear+ " Year, " + myMonth + " Month, " + myDay+" Day";
        }
        catch (DateTimeException e){
            System.out.println(e.getMessage());
        }
        this.age = myAge;
    }

    public boolean isLicenseValidity() {
        return licenseValidity;
    }

    public void setLicenseValidity(boolean licenseValidity) {
        this.licenseValidity = licenseValidity;
    }


    @Override
    public String toString() {
        return super.toString()+
                "Customer{" +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", licenseValidity=" + licenseValidity +
                ", Discount Point=" + loyalty +
                '}';
    }
}
