package com.eventxplorer.EventXplorer.API.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigInteger;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String email;
    private String city;
    private String country;
    private String url_photo;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String type_identification;
    private BigInteger number_identification;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUrlPhoto() {
        return url_photo;
    }

    public void setUrlPhoto(String url_photo) {
        this.url_photo = url_photo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTypeIdentification() {
        return type_identification;
    }

    public void setTypeIdentification(String type_identification) {
        this.type_identification = type_identification;
    }

    public BigInteger getNumberIdentification() {
        return number_identification;
    }

    public void setNumberIdentification(BigInteger number_identification) {
        this.number_identification = number_identification;
    }

    @Override
    public String toString(){
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", city=" + city + ", country=" + country + ", urlPhoto=" + url_photo + ", birthday=" + birthday + ", typeIdentification=" + type_identification + ", numberIdentification=" + number_identification + "]";
    }

}
