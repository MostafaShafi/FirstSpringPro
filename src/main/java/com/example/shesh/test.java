package com.example.shesh;

import com.example.shesh.Models.Person;
import com.example.shesh.Models.Users;
import com.example.shesh.Models.utilModel.Gender;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person(1l, "ali", "alavi", null, Gender.Male, "09123456789", new ArrayList<>());
        String pJson = gson.toJson(person);
        String json = "{\"_id\":-1,\"_firstName\":\"ali\",\"_lastName\":\"alavi\",\"_phone\":912}";
        String json1 = "{\"_id\":-1,\"_firstName\":\"ali\",\"_lastName\":\"alavi\",\"_birthDay\":\"1989-12-31T20:30:00.000Z\"," +
                "\"_gender\":\"M\",\"_phone\":123,\"_addresses\":[],\"_username\":\"ali\",\"_password\":\"123\"," +
                "\"_email\":\"ali@g.com\",\"_registerDate\":\"2022-03-01T14:00:34.439Z\",\"_userType\":2}";
        String json2 = "{\"_id\":-1,\"_firstName\":\"ali\",\"_lastName\":\"alavi\",\"_birthDay\":\"1989-12-31T20:30:00.000Z\",\"_gender\":\"M\",\"_phone\":123,\"_addresses\":[]}";
        //System.out.println(pJson);
        System.out.println(gson.fromJson(json1, Users.class).toString());
        System.out.println(gson.fromJson(json1, Users.class).toString());
        //System.out.println(gson.fromJson(json2, Person.class).toString());
        //System.out.println(gson.fromJson(pJson, Person.class).toString());
    }
}
