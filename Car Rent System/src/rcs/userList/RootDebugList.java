package rcs.userList;

import rcs.user.Root;

import java.io.Serializable;
import java.util.ArrayList;

public class RootDebugList extends Root implements Serializable {

    private ArrayList<StringBuffer> bugs = new ArrayList<>();

    public RootDebugList(String userName, String password, String name, String gender, String telefone, String email) {
        super(userName, password, name, gender, telefone, email);
    }

    public void setReport(StringBuffer report){
        bugs.add(report);
    }

    public void showAllNotification(){
        for (int i =0;i<bugs.size();i++){
            if (bugs !=null){
                System.out.println(bugs.get(i));
            }
        }
    }
}
