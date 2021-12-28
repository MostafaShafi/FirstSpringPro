package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.UserType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass
public class Users extends Person{

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

    @SerializedName("userType")
    @Column(name = "userType")
    @Enumerated(EnumType.ORDINAL)
    private UserType _userType;

    public Users(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone, List<Address> _addresses) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
    }

    public Users(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                 List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
        this._username = _username;
        this._password = _password;
        this._email = _email;
        this._registerDate = _registerDate;
        this._userType = _userType;
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

