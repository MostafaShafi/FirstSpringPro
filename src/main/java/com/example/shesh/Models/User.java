package com.example.shesh.Models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Entity
@Table(name = "User")
@MappedSuperclass
public class User extends Person{

    @SerializedName("username")
    @Column(name = "username", updatable = false, nullable = false)
    private String _username;

    @SerializedName("password")
    @Column(name = "password", nullable = false)
    private String _password;

    @SerializedName("email")
    @Column(name = "email", nullable = false)
    private String _email;

    @SerializedName("registerDate")
    @Column(name = "registerDate", updatable = false)
    @Temporal(TemporalType.DATE)
    private Date _registerDate;

    public String getUsername() {
        return _username;
    }

    public void setUsername(String username) {
        _username = username;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password) {
        _password = password;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public Date getRegisterDate() {
        return _registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        _registerDate = registerDate;
    }
}

