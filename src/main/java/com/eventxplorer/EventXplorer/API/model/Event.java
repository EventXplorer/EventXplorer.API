package com.eventxplorer.EventXplorer.API.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;


@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title", nullable = false, length = 50)
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="date", nullable = false)
    private Date date;
    @Column(name="duration", nullable = false)
    private LocalTime duration;
    @Column(name="capacity", nullable = false)
    private int capacity;
    @Column(name="amount", nullable = false)
    private double amount;
    @Column(name="address", nullable = false, length = 50)
    private String address;
    @Column(name="city", nullable = false, length = 50)
    private String city;
    @Column(name="district", nullable = false, length = 50)
    private String district;
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false
            , foreignKey = @ForeignKey(name = "FK_USER_ID"))
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    @Override
    public String toString(){
        return "Event [id=" + id + ", title=" + title + ", date=" + date + ", duration=" + duration + ", capacity=" + capacity + ", amount=" + amount + ", address=" + address + ", city=" + city + ", district=" + district + ", user=" + user + "]";
    }
}
