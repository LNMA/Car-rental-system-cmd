package rcs.user;
import rcs.user.*;
import java.io.Serializable;

public class Root extends User implements Serializable {
    private final String USER_TYPE = "root";

    public Root(String userName, String password, String name, String gender, String telefone, String email) {
        super(userName, password, name, gender, telefone, email);
        setType();
    }


    @Override
    public void setType( ) {
        super.type = "root";
    }

}
