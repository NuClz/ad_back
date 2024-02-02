package com.example.health.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "advertisement")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adId;

    @ManyToOne
    @JoinColumn(name = "adminId", referencedColumnName = "adminId")
    private Admin admin;

    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String imageUrl;

    public Advertisement() {
    }

    public Advertisement(Long adId, Admin admin, String title, String description,
                         LocalDate startDate, LocalDate endDate, String imageUrl) {
        this.adId = adId;
        this.admin = admin;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imageUrl = imageUrl;
    }

    public Long getAdId() {
        return adId;
    }

    public Admin getAdmin() {
        return admin;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // // toString() method
    // @Override
    // public String toString() {
    //     return "Advertisement{" +
    //             "adId=" + adId +
    //             ", admin=" + admin +
    //             ", title='" + title + '\'' +
    //             ", description='" + description + '\'' +
    //             ", startDate=" + startDate +
    //             ", endDate=" + endDate +
    //             ", imageUrl='" + imageUrl + '\'' +
    //             '}';
    // }
}
