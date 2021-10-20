package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.LocationType;
import com.example.shesh.Models.utilModel.LocationTypeConverter;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "Location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("id")
    @Column(name = "id")
    private Long _id;

    @SerializedName("parentName")
    @Column(name = "parentName")
    private Long _parentName;

    @SerializedName("name")
    @Column(name = "name")
    private String _name;

    @SerializedName("locationType")
    @Column(name = "locationType")
    @Convert(converter = LocationTypeConverter.class)
    private LocationType _locationType;

    @SerializedName("latitude")
    @Column(name = "latitude")
    private Long _latitude;

    @SerializedName("longitude")
    @Column(name = "longitude")
    private Long _longitude;

    @SerializedName("code")
    @Column(name = "code")
    private Integer _code;

    @SerializedName("phoneCode")
    @Column(name = "phoneCode")
    private Integer _phoneCode;

    public Long getId() {
        return _id;
    }

    public void setId(Long _id) {
        this._id = _id;
    }

    public Long getParentName() {
        return _parentName;
    }

    public void setParentName(Long _parentName) {
        this._parentName = _parentName;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public LocationType getLocationType() {
        return _locationType;
    }

    public void setLocationType(LocationType _locationType) {
        this._locationType = _locationType;
    }

    public Long getLatitude() {
        return _latitude;
    }

    public void setLatitude(Long _latitude) {
        this._latitude = _latitude;
    }

    public Long getLongitude() {
        return _longitude;
    }

    public void setLongitude(Long _longitude) {
        this._longitude = _longitude;
    }

    public Integer getCode() {
        return _code;
    }

    public void setCode(Integer _code) {
        this._code = _code;
    }

    public Integer getPhoneCode() {
        return _phoneCode;
    }

    public void setPhoneCode(Integer _phoneCode) {
        this._phoneCode = _phoneCode;
    }
}
