package com.eventxplorer.EventXplorer.API.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="url_photo", nullable = false, length = 100)
    private String urlPhoto;
    @Column(name="title", nullable = false, length = 50)
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="date", nullable = false)
    private Date date;
    @JsonFormat(pattern = "HH:mm")
    @Column(name="start_time", nullable = false)
    private LocalTime startTime;
    @JsonFormat(pattern = "HH:mm")
    @Column(name="end_time", nullable = false)
    private LocalTime endTime;
    @Column(name="capacity", nullable = false)
    private int capacity;
    @Column(name="amount", nullable = false)
    private double amount;
    @Column(name="address", nullable = false, length = 100)
    private String address;
    @Column(name="city", nullable = false, length = 50)
    private String city;
    @Column(name="district", nullable = false, length = 50)
    private String district;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false
            , foreignKey = @ForeignKey(name = "FK_USER_ID_EVENT"))
    private User user;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false
            , foreignKey = @ForeignKey(name = "FK_CATEGORY_ID_EVENT"))
    private Category category;


}
