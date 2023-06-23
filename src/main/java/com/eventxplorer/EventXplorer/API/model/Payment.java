package com.eventxplorer.EventXplorer.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="amount", nullable = false)
    private double amount;

    @Column(name="date", nullable = false)
    private LocalDate date;

    @Column(name="status_payment", nullable = false)
    private Boolean status_payment;

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getStatus_payment() {
        return status_payment;
    }

    public void setStatus_payment(Boolean status_payment) {
        this.status_payment = status_payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        	return "Payment [id=" + id + ", amount=" + amount + ", date=" + date + ", status_payment=" + status_payment + ", user=" + user + "]";
    }

}
