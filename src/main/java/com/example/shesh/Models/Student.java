package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Term;
import com.example.shesh.Models.utilModel.TermConverter;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "Student")
public class Student extends User{
    @Id
    @SerializedName("studentId")
    @Column(name = "studentId")
    private Long _studentId;

    @SerializedName("field")
    @Column(name = "field")
    @ManyToOne(fetch = FetchType.LAZY)
    private Field _field;

    @SerializedName("grade")
    @Column(name = "grade")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grade _grade;

    @SerializedName("enterYear")
    @Column(name = "enterYear")
    @Min(1350)
    @Max(1500)
    private Integer _enterYear;

    @SerializedName("enterTerm")
    @Column(name = "enterTerm")
    @Convert(converter = TermConverter.class)
    private Term _enterTerm;

    public Long getStudentId() {
        return _studentId;
    }

    public void setStudentId(Long _studentId) {
        this._studentId = _studentId;
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

    public Integer getEnterYear() {
        return _enterYear;
    }

    public void setEnterYear(Integer _enterYear) {
        this._enterYear = _enterYear;
    }

    public Term getEnterTerm() {
        return _enterTerm;
    }

    public void setEnterTerm(Term _enterTerm) {
        this._enterTerm = _enterTerm;
    }
}
