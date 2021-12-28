package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.UserType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Master")
public class Master extends Users {

    @SerializedName("masterId")
    @Column(name = "masterId")
    private Integer _masterId;

    @SerializedName("field")
    @JoinColumn(name = "field")
    @ManyToOne(fetch = FetchType.LAZY)
    private Field _field;

    @SerializedName("grade")
    @JoinColumn(name = "grade")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grade _grade;

    public Master(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone, List<Address> _addresses) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
    }

    public Master(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                  List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses, _username, _password, _email, _registerDate, _userType);
    }

    public Master(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                  List<Address> _addresses, Integer _masterId, Field _field, Grade _grade) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
        this._masterId = _masterId;
        this._field = _field;
        this._grade = _grade;
    }

    public Master(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone, List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType, Integer _masterId, Field _field, Grade _grade) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses, _username, _password, _email, _registerDate, _userType);
        this._masterId = _masterId;
        this._field = _field;
        this._grade = _grade;
    }

    public Master() {
    }

    public Integer getMasterId() {
        return _masterId;
    }

    public void setMasterId(Integer _masterId) {
        this._masterId = _masterId;
    }

    public Field getField() {
        return _field;
    }

    public void setField(Field _field) {
        this._field = _field;
    }

    public Grade getGrade() {
        return _grade;
    }

    public void setGrade(Grade _grade) {
        this._grade = _grade;
    }
}
