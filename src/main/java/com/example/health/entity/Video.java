package com.example.health.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoId;

    @ManyToOne
    @JoinColumn(name = "adminId", referencedColumnName = "adminId")
    private Admin admin;

    private String title;
    private String description;
    private LocalDate uploadDate;
    private String imageUrl;
    private String videoUrl;


    public Video() {
    }

    public Video(Long videoId, Admin admin, String title, String description, 
                 LocalDate uploadDate, String imageUrl, String videoUrl) {
        this.videoId = videoId;
        this.admin = admin;
        this.title = title;
        this.description = description;
        this.uploadDate = uploadDate;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
    }


    public Long getVideoId() {
        return videoId;
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

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }


    public void setVideoId(Long videoId) {
        this.videoId = videoId;
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

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    // // toString() method
    // @Override
    // public String toString() {
    //     return "Video{" +
    //             "videoId=" + videoId +
    //             ", admin=" + admin +
    //             ", title='" + title + '\'' +
    //             ", description='" + description + '\'' +
    //             ", uploadDate=" + uploadDate +
    //             ", imageUrl='" + imageUrl + '\'' +
    //             ", videoUrl='" + videoUrl + '\'' +
    //             '}';
    // }
}
