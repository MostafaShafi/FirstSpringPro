package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.LocationTypeConverter;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @SerializedName("id")
    @Column(name = "id")
    private Long _id;

    @SerializedName("country")
    @JoinColumn(name = "country")
    @Convert(converter = LocationTypeConverter.class)
    @ManyToOne(fetch = FetchType.LAZY)
    private Location _country;

    @SerializedName("province")
    @JoinColumn(name = "province")
    @Convert(converter = LocationTypeConverter.class)
    @ManyToOne(fetch = FetchType.LAZY)
    private Location _province;

    @SerializedName("town")
    @JoinColumn(name = "town")
    @Convert(converter = LocationTypeConverter.class)
    @ManyToOne(fetch = FetchType.LAZY)
    private Location _town;

    @SerializedName("address")
    @Column(name = "address")
    private String _address;

    @SerializedName("postalCode")
    @Column(name = "postalCode")
    private Long _postalCode;

    public Long getId() {
        return _id;
    }

    public void setId(Long _id) {
        this._id = _id;
    }

    public Location getCountry() {
        return _country;
    }

    public void setCountry(Location _country) {
        this._country = _country;
    }

    public Location getProvince() {
        return _province;
    }

    public void setProvince(Location _province) {
        this._province = _province;
    }

    public Location getTown() {
        return _town;
    }

    public void setTown(Location _town) {
        this._town = _town;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String _address) {
        this._address = _address;
    }

    public Long getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(Long _postalCode) {
        this._postalCode = _postalCode;
    }
}
