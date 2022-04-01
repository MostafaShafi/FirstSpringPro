package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.GenderConverter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long _id;

    @Column(name = "firstName")
    private String _firstName;

    @Column(name = "lastName")
    private String _lastName;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date _birthDay;

    @Column(name = "gender")
    @Convert(converter = GenderConverter.class)
    private Gender _gender;

    @Column(name = "phone")
    private String _phone;

    @Column(name = "addresses")
    @ManyToMany()
    private List<Address> _addresses;

    public Person(Long id, String firstName, String lastName, Date birthDay, Gender gender, String phone, List<Address> addresses) {
        this._id = id;
        this._firstName = firstName;
        this._lastName = lastName;
        this._birthDay = birthDay;
        this._gender = gender;
        this._phone = phone;
        this._addresses = addresses;
    }

    public Person() {
    }

    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        _id = id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public Date getBirthDay() {
        return _birthDay;
    }

    public void setBirthDay(Date birthDay) {
        _birthDay = birthDay;
    }

    public Gender getGender() {
        return _gender;
    }

    public void setGender(Gender gender) {
        this._gender = gender;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String _phone) {
        this._phone = _phone;
    }

    public List<Address> getAddresses() {
        return _addresses;
    }

    public void setAddresses(List<Address> _addresses) {
        this._addresses = _addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "_id=" + _id +
                ", _firstName='" + _firstName + '\'' +
                ", _lastName='" + _lastName + '\'' +
                ", _birthDay=" + _birthDay +
                ", _gender=" + _gender +
                ", _phone='" + _phone + '\'' +
                ", _addresses=" + _addresses +
                '}';
    }
}
