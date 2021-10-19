package com.example.shesh.Models;

import com.example.shesh.Models.utilModel.Level;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class Author extends User{

    @Column(name = "level")
    private Level _level;
}
