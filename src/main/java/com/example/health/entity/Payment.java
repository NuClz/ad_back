package com.example.health.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    private LocalDateTime paymentTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double amount;
    private String status;

    public Payment() {
    }

    public Payment(Long paymentId, User user, LocalDateTime paymentTime,
                   LocalDateTime startTime, LocalDateTime endTime, Double amount, String status) {
        this.paymentId = paymentId;
        this.user = user;
        this.paymentTime = paymentTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.amount = amount;
        this.status = status;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // // toString() method
    // @Override
    // public String toString() {
    //     return "Payment{" +
    //             "paymentId=" + paymentId +
    //             ", user=" + user +
    //             ", paymentTime=" + paymentTime +
    //             ", startTime=" + startTime +
    //             ", endTime=" + endTime +
    //             ", amount=" + amount +
    //             ", status='" + status + '\'' +
    //             '}';
    // }
}
