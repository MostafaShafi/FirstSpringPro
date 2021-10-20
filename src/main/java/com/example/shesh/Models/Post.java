package com.example.shesh.Models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "post", schema = "public")
public class Post {
    @Id
    @Column(name = "id")
    @SerializedName("id")
    private Long _id;

    @Column(name = "author")
    @ManyToOne(fetch = FetchType.LAZY)
    private Author _author;

    @Column(name = "title")
    @SerializedName("title")
    private String _title;

    @Column(name = "body")
    @SerializedName("body")
    private String _body;

    @Column(name = "releaseDate")
    @Temporal(TemporalType.DATE)
    private Date _releaseDate;

    @Column(name = "lastUpdate")
    @Temporal(TemporalType.DATE)
    private Date _lastUpdate;

    public Post() {
    }

    public Post(Long _id, Author _author, String _title, String _body) {
        this._id = _id;
        this._author = _author;
        this._title = _title;
        this._body = _body;
    }

    public Long getId() {
        return _id;
    }

    public void setId(Long _id) {
        this._id = _id;
    }

    public Author getAuthor() {
        return _author;
    }

    public void setAuthor(Author _author) {
        this._author = _author;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public String getBody() {
        return _body;
    }

    public void setBody(String _body) {
        this._body = _body;
    }

    public Date getReleaseDate() {
        return _releaseDate;
    }

    public void setReleaseDate(Date _releaseDate) {
        this._releaseDate = _releaseDate;
    }

    public Date getLastUpdate() {
        return _lastUpdate;
    }

    public void setLastUpdate(Date _lastUpdate) {
        this._lastUpdate = _lastUpdate;
    }
}
