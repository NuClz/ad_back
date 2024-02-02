package com.example.health.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    private String name;
    private String password;
    private LocalDate birthDate;
    private String emailAddress;

    // Constructors
    public User() {
    }

    public User(Long userId, String name, String password, LocalDate birthDate, String emailAddress) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
    }

    // Getters
    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // // toString() method for debugging
    // @Override
    // public String toString() {
    //     return "User{" +
    //             "userId=" + userId +
    //             ", name='" + name + '\'' +
    //             ", password='" + "*********" + '\'' +
    //             ", birthDate=" + birthDate +
    //             ", emailAddress='" + emailAddress + '\'' +
    //             '}';
    // }
}
