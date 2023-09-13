package com.mvc.demo.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Objects;

@Builder
public class ClubDto {

    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime updatedAt;

    public ClubDto() {}

    public ClubDto(Long id, String title,
                   String photoUrl,
                   String content,
                   LocalDateTime createdOn,
                   LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.photoUrl = photoUrl;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedAt = updatedAt;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubDto clubDto)) return false;
        return Objects.equals(id, clubDto.id) && Objects.equals(title, clubDto.title) && Objects.equals(photoUrl, clubDto.photoUrl) && Objects.equals(content, clubDto.content) && Objects.equals(createdOn, clubDto.createdOn) && Objects.equals(updatedAt, clubDto.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, photoUrl, content, createdOn, updatedAt);
    }

    @Override
    public String toString() {
        return "ClubDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", content='" + content + '\'' +
                ", createdOn=" + createdOn +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
