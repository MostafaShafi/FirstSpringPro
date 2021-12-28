package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.GenderConverter;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @SerializedName("id")
    @Column(name = "id")
    private Long _id;

    @SerializedName("firstName")
    @Column(name = "firstName")
    private String _firstName;

    @SerializedName("lastName")
    @Column(name = "lastName")
    private String _lastName;

    @SerializedName("birthday")
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date _birthDay;

    @SerializedName("gender")
    @Column(name = "gender")
    @Convert(converter = GenderConverter.class)
    private Gender _gender;

    @SerializedName("phone")
    @Column(name = "phone")
    private String _phone;

    @SerializedName("addresses")
    @Column(name = "addresses")
    @ManyToMany()
    private List<Address> _addresses;

    public Person(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone, List<Address> _addresses) {
        this._id = _id;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._birthDay = _birthDay;
        this._gender = _gender;
        this._phone = _phone;
        this._addresses = _addresses;
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
}
