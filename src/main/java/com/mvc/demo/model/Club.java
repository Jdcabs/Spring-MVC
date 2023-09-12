package com.mvc.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "club")
public class Club {
    @Id
    @SequenceGenerator(allocationSize = 1,
            name = "clubId",
            sequenceName = "clubId")
    @GeneratedValue(generator = "clubId",strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 150)
    private String title;
    @Column(nullable = false)
    private String photoUrl;
    @Column(nullable = false, length = 150)
    private String content;
    @Column(nullable = false)
    @CreationTimestamp(source = SourceType.DB)
    private LocalDateTime createdOn;
    @Column(nullable = false)
    @UpdateTimestamp(source = SourceType.DB)
    private LocalDateTime updatedAt;

    public Club() {}

    public Club(String title,
                String photoUrl,
                String content,
                LocalDateTime createdOn,
                LocalDateTime updatedAt) {
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
        return title;
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
        if (!(o instanceof Club club)) return false;
        return Objects.equals(getId(), club.getId()) && Objects.equals(getTitle(), club.getTitle()) && Objects.equals(getPhotoUrl(), club.getPhotoUrl()) && Objects.equals(getContent(), club.getContent()) && Objects.equals(getCreatedOn(), club.getCreatedOn()) && Objects.equals(getUpdatedAt(), club.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getPhotoUrl(), getContent(), getCreatedOn(), getUpdatedAt());
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", content='" + content + '\'' +
                ", createdOn=" + createdOn +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
