package org.example.Amer;

import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;

//CLASS BLUEPRINT
public class Person {
    private String firstName;  //Field
    private String lastName;   //Field
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setBirthDate(int age){
        this.age = age;
    }


    public int  getBirthDate() {

        return age;
    }
}
