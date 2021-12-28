package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.Term;
import com.example.shesh.Models.utilModel.TermConverter;
import com.example.shesh.Models.utilModel.UserType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student extends Users {

    @SerializedName("studentId")
    @Column(name = "studentId")
    private Long _studentId;

    @SerializedName("field")
    @JoinColumn(name = "field")
    @ManyToOne(fetch = FetchType.LAZY)
    private Field _field;

    @SerializedName("grade")
    @JoinColumn(name = "grade")
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

    public Student(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone, List<Address> _addresses) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
    }

    public Student(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                   List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses, _username, _password, _email, _registerDate, _userType);
    }

    public Student(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                   List<Address> _addresses, Long _studentId, Field _field, Grade _grade, Integer _enterYear, Term _enterTerm) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
        this._studentId = _studentId;
        this._field = _field;
        this._grade = _grade;
        this._enterYear = _enterYear;
        this._enterTerm = _enterTerm;
    }

    public Student(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                   List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType, Long _studentId, Field _field, Grade _grade, Integer _enterYear, Term _enterTerm) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses, _username, _password, _email, _registerDate, _userType);
        this._studentId = _studentId;
        this._field = _field;
        this._grade = _grade;
        this._enterYear = _enterYear;
        this._enterTerm = _enterTerm;
    }

    public Student() {
    }

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
