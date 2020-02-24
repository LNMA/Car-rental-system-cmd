package rcs.user;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

abstract public class User implements Serializable {
    private String userName;
    private String password;
    private String name;
    private String gender;
    private String telefone;
    private String email;
    private Date dateCreat;
    protected String type;
    private String available;

    public User(String userName, String password, String name, String gender, String telefone, String email) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.telefone = telefone;
        this.email = email;
        this.available = "unavailable";
        setDateCreat();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setTypeRoot(String type){
        this.type = type;
    }

    abstract public void setType() ;

    public Date getDateCreat() {
        return dateCreat;
    }

    public void setDateCreat() {
        this.dateCreat = new GregorianCalendar().getTime();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dateCreat=" + dateCreat +
                ", type='" + type + '\'' +
                ", available='" + available + '\'' +
                '}';
    }
}

