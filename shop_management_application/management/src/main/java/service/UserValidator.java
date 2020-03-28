package service;

import entity.User;
import exceptions.UserLoginAlreadyExistException;
import exceptions.UserShortLengthLoginException;
import exceptions.UserShortLengthPasswordException;

import java.io.IOException;

public class UserValidator {


    //Singleton
    private static UserValidator instance = null;
    private UserValidator(){

    }
    public static UserValidator getInstance(){
        if(instance==null){
            instance = new UserValidator();
        }
        return instance;
    }

    public boolean isValidate(User user) {
        try {
            if (isLoginOk(user) && isPasswordOk(user) && !isUserByLoginExist(user)) {
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return false;
    }

    private boolean isPasswordOk(User user) throws UserShortLengthPasswordException {
        if(user.getPassword().length()<6){
            throw new UserShortLengthPasswordException();
        }
        return true;
    }

    private boolean isLoginOk(User user) throws UserShortLengthLoginException{
        if(user.getLogin().length()<4){
            throw new UserShortLengthLoginException();
        }
        return true;
    }

    private boolean isUserByLoginExist(User user) throws UserLoginAlreadyExistException, IOException {
        UserServiceImpl userService = UserServiceImpl.getInstance();
        if(userService.getUserByName(user.getLogin())==null){
            throw new UserLoginAlreadyExistException();
        }
        return false;
    }

}
