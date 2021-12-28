package com.example.shesh.Models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "Field")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("id")
    @Column(name = "id")
    private Integer _id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("name")
    @Column(name = "name")
    private Integer _name;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("gradeId")
    @Column(name = "gradeId")
    private Integer _gradeId;

    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public Integer getName() {
        return _name;
    }

    public void setName(Integer name) {
        this._name = name;
    }

    public Integer getGradeId() {
        return _gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this._gradeId = gradeId;
    }
}
