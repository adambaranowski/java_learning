package service;

import api.UserService;
import dao.UserDaoImpl;
import entity.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

//    public List<User> users;
////
////    public UserServiceImpl(){
////        this.users = new ArrayList<User>();
////
////    }

    UserDaoImpl userDao = UserDaoImpl.getInstance();

    private UserServiceImpl(){

    }

    private static UserServiceImpl instance = null;

    public static UserServiceImpl getInstance(){
        if(instance==null){
            instance = new UserServiceImpl();
        }
        return  instance;
    }

   // public UserServiceImpl(List<User> users){
    //   this.users = users;
    //}

    @Override
    public User getUserByName(String username) throws IOException {
        for (User u: userDao.getAllUsers()
             ) {
            if(u.getLogin().equals(username)){
                return u;
            }

        }
        return null;
    }

    @Override
    public List<User> getAllUsers() throws IOException {
       return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) throws IOException {
        UserValidator userValidator = UserValidator.getInstance();
        if (userValidator.isValidate(user)) {
            userDao.saveUser(user);


        }

    }

    @Override
    public void removeUserById(Long userId) throws IOException {
        for(int i = 0; i < userDao.getAllUsers().size(); i++){
            //wyciągniecie itego usera z listy
            User userFromList = userDao.getAllUsers().get(i);
            //jeżeli id usera z listy równe podanemu to usuwamy
            if(userFromList.getId() == userId){
                userDao.getAllUsers().remove(i);
                break;
            }
        }
    }

}
