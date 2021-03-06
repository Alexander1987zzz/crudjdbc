package com.example.demo.model;

import com.example.demo.regular.EmailValidatorSimple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private int id = 0;
    private String firstName;
    private String secondName;
    private int age;
    private String email;
   

    public User() {}

    public User(int ID, String firstName, String secondName, int age, String email) {
        this.id = ID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getEmail() { return email;}

    public void setEmail(String email) {  this.email = email;  }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }


}
