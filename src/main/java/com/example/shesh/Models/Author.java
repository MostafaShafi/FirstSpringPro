package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.AuthorType;
import com.example.shesh.Models.utilModel.Level;

import javax.persistence.*;

@Entity
@Table(name = "Author")
public class Author extends User{

    @Column(name = "level")
    private Level _level;

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private AuthorType _type;

    @Column(name = "typeId")
    private Long _typeId;

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
