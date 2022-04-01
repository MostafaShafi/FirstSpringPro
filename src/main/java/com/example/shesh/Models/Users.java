package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.UserType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Users extends Person {

    @Column(name = "username", updatable = false, nullable = false)
    private String _username;

    @Column(name = "password", nullable = false)
    private String _password;

    @Column(name = "email", nullable = false)
    private String _email;

    @Column(name = "registerDate", updatable = false)
    @Temporal(TemporalType.DATE)
    private Date _registerDate;

    @Column(name = "userType")
    @Enumerated(EnumType.ORDINAL)
    private UserType _userType;

    public Users(String username, String password, String email, Date registerDate, UserType userType) {
        this._username = username;
        this._password = password;
        this._email = email;
        this._registerDate = registerDate;
        this._userType = userType;
    }

    public Users(Long id, String firstName, String lastName, Date birthDay, Gender gender, String phone,
                 List<Address> addresses, String username, String password, String email, Date registerDate, UserType userType) {
        super(id, firstName, lastName, birthDay, gender, phone, addresses);
        this._username = username;
        this._password = password;
        this._email = email;
        this._registerDate = registerDate;
        this._userType = userType;
    }

    public Users(Long id, String firstName, String lastName, Date birthDay, Gender gender, String phone, List<Address> addresses) {
        super(id, firstName, lastName, birthDay, gender, phone, addresses);
    }

    public Users() {
        super();
    }

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

