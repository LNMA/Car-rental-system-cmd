package rcs.userList;
import rcs.user.Supervisor;

import java.io.Serializable;
import java.util.ArrayList;

public class SupervisorNotificationList extends Supervisor implements Serializable {

    private ArrayList<StringBuffer> notification = new ArrayList<>();

    public SupervisorNotificationList(String userName, String password, String name, String gender, String telefone, String email, String section, String rank) {
        super(userName, password, name, gender, telefone, email, section, rank);
    }

    public void setReport(StringBuffer report){
        notification.add(report);
    }

    public void showAllNotification(){
        for (int i =0;i<notification.size();i++){
            if (notification !=null){
                System.out.println(notification.get(i));
            }
        }
    }

}
