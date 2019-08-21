package com.dfbz.servlet;

import java.util.Arrays;

/**
 * @author As_los
 * @date 2019/8/21  19:23
 */

public class User {
    private String name;
    private String gender;
    private String city;
    private String[] hobby;

    public User() {
    }

    public User(String name, String gender, String city, String[] hobby) {
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
