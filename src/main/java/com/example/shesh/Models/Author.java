package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.AuthorType;
import com.example.shesh.Models.utilModel.Gender;
import com.example.shesh.Models.utilModel.Level;
import com.example.shesh.Models.utilModel.UserType;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Author")
public class Author extends Users {

    @SerializedName("level")
    @Column(name = "level")
    private Level _level;

    @SerializedName("type")
    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private AuthorType _type;

    @SerializedName("typeId")
    @Column(name = "typeId")
    private Long _typeId;

    public Author(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone, List<Address> _addresses) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
    }

    public Author(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                  List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses, _username, _password, _email, _registerDate, _userType);
    }

    public Author(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                  List<Address> _addresses, Level _level, AuthorType _type, Long _typeId) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses);
        this._level = _level;
        this._type = _type;
        this._typeId = _typeId;
    }

    public Author(Long _id, String _firstName, String _lastName, Date _birthDay, Gender _gender, String _phone,
                  List<Address> _addresses, String _username, String _password, String _email, Date _registerDate, UserType _userType, Level _level, AuthorType _type, Long _typeId) {
        super(_id, _firstName, _lastName, _birthDay, _gender, _phone, _addresses, _username, _password, _email, _registerDate, _userType);
        this._level = _level;
        this._type = _type;
        this._typeId = _typeId;
    }

    public Author() {
    }

    public Level getLevel() {
        return _level;
    }

    public void setLevel(Level _level) {
        this._level = _level;
    }

    public AuthorType getType() {
        return _type;
    }

    public void setType(AuthorType _type) {
        this._type = _type;
    }

    public Long getTypeId() {
        return _typeId;
    }

    public void setTypeId(Long _typeId) {
        this._typeId = _typeId;
    }
}
