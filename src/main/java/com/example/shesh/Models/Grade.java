package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Sequence;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "Grade")
public class Grade {

    @Id
    @SerializedName("id")
    @Column(name = "id")
    private Integer _id;

    @SerializedName("name")
    @Column(name = "name")
    private String _name;

    @SerializedName("sequence")
    @Column(name = "sequence")
    @Enumerated(EnumType.ORDINAL)
    private Sequence _sequence;

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public Sequence getSequence() {
        return _sequence;
    }

    public void setSequence(Sequence _sequence) {
        this._sequence = _sequence;
    }
}
