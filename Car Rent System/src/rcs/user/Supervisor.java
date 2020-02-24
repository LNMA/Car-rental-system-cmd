package rcs.user;

import java.io.Serializable;

public class Supervisor extends User implements Serializable {
    private String Section;
    private String rank;
    private final String USER_TYPE = "supervisor";


    public Supervisor(String userName, String password, String name, String gender, String telefone, String email, String section, String rank) {
        super(userName, password, name, gender, telefone, email);
        Section = section;
        this.rank = rank;
        setType();
    }


    @Override
    public void setType() {
        super.type = USER_TYPE;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Supervisor{" +
                "Section='" + Section + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
