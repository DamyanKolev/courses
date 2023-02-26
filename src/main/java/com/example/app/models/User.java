package com.example.app.models;

import jakarta.persistence.Entity;

@Entity
public class User {

    public Long Id;
    public String Username;
    public String Password;
}
