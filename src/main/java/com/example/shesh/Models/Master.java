package com.example.shesh.Models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Master")
public class Master extends User{

    @Id
    @SerializedName("masterId")
    @Column(name = "masterId")
    private Integer _masterId;

    @SerializedName("field")
    @Column(name = "field")
    @ManyToOne(fetch = FetchType.LAZY)
    private Field _field;

    @SerializedName("grade")
    @Column(name = "grade")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grade _grade;

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
