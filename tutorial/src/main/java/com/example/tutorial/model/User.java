package com.example.tutorial.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    private  String name;
    private  String password;

    public User(){

    }

    public User( @JsonProperty String name, @JsonProperty String password) {
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}
