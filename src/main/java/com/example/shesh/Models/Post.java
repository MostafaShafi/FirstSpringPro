package com.example.shesh.Models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "post", schema = "public")
public class Post {
    @Id
    @Column(name = "id")
    @SerializedName("id")
    private Integer _id;
    @Column(name = "user_id")
    @Size(max = 2, min = 2)
    @Pattern(regexp = "[0-9]{2}", message = "Should be just 2 digits!")
    @SerializedName("userId")
    private Integer _userId;
    @Column(name = "title")
    @SerializedName("title")
    private String _title;
    @Column(name = "body")
    @SerializedName("body")
    private String _body;

    public Post() {
    }

    public Post(Integer id, Integer userId, String title, String body) {
        this._id = id;
        this._userId = userId;
        this._title = title;
        this._body = body;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Integer get_userId() {
        return _userId;
    }

    public void set_userId(Integer userId) {
        this._userId = userId;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String title) {
        this._title = title;
    }

    public String get_body() {
        return _body;
    }

    public void set_body(String body) {
        this._body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + _id +
                ", userId=" + _userId +
                ", title='" + _title + '\'' +
                ", body='" + _body + '\'' +
                '}';
    }
}
