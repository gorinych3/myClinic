package ru.clinic.myClinic;

public class UserUncorrectedException extends Exception{

    public UserUncorrectedException(final String message){
        super(message);
    }
}
