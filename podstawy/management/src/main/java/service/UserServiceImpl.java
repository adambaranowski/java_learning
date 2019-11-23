package service;

import api.UserService;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<User>();

    }

    public UserServiceImpl(List<User> users){
        this.users = users;
    }

    @Override
    public List<User> getAllUsers(){
       return users;
    }

    @Override
    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void removeUserById(Long userId){
        for(int i = 0; i < users.size(); i++){
            //wyciągniecie itego usera z listy
            User userFromList = users.get(i);
            //jeżeli id usera z listy równe podanemu to usuwamy
            if(userFromList.getId() == userId){
                users.remove(i);
                break;
            }
        }
    }

}
