package Math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserService {

    //constructor

    private List<String> users;

    //CZY DOBRZE Z TĄ LISTĄ ZAPYTAĆ PANA


    public UserService(List<String> users) {
        this.users = new ArrayList<String>(users);
        //CZY MOŻE this.users = users;
    }


    public boolean IsAny(){
        if(users.isEmpty()){
            return false;
        }
        else{

            return true;
        }
    }

    public int HowMany(){
        return users.size();

    }
}
