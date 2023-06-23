package com.eventxplorer.EventXplorer.API.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;
import java.util.Date;

@Entity
public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
    private String city;
    private String country;
    private String urlphoto;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String typeidentification;
    private BigInteger numberidentification;
    @Column(name="credit_card", nullable = false, length = 16)
    private String creditcard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return urlphoto;
    }

    public void setUrlPhoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTypeIdentification() {
        return typeidentification;
    }

    public void setTypeIdentification(String typeidentification) {
        this.typeidentification = typeidentification;
    }

    public BigInteger  getNumberIdentification() {
        return numberidentification;
    }

    public void setNumberIdentification(BigInteger  numberidentification) {
        this.numberidentification = numberidentification;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    @Override
    public String toString(){
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", city=" + city + ", country=" + country + ", urlPhoto=" + urlphoto + ", birthday=" + birthday + ", typeIdentification=" + typeidentification + ", numberIdentification=" + numberidentification + ",creditCard=" + creditcard + "]";
    }

}