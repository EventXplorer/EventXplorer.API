package com.eventxplorer.EventXplorer.API.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
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
@Table(name = "assists")
public class Assist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false
            , foreignKey = @ForeignKey(name = "FK_USER_ID"))
    private User user;

    @ManyToOne
    @JoinColumn(name="event_id", nullable = false
            , foreignKey = @ForeignKey(name = "FK_EVENT_ID"))
    private Event event;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="confirmed_date", nullable = false)
    private Date confirmedDate;

    @JsonFormat(pattern = "HH:mm")
    @Column(name="confirmed_time", nullable = false)
    private LocalTime confirmedTime;

}
