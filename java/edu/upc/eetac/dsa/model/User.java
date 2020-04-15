package edu.upc.eetac.dsa.model;

import java.beans.JavaBean;
@JavaBean
public class User {

    private String name;
    private String surname;


    public User(){

    }

    public User(String name, String surname){

        this.setName(name);
        this.setSurname(surname);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getSurname(){

        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;

    }








}
