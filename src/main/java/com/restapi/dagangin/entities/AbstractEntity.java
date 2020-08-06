package com.restapi.dagangin.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class AbstractEntity<KEY> {
    
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private KEY id;
    
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt; 
    
    @Column(name = "update_at")
    private LocalDateTime updatedAt;
    
    @PrePersist
    private void prePersist() {
        createdAt = LocalDateTime.now();
    }
    
    @PreUpdate
    private void preUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public AbstractEntity() {
    }

    
    public AbstractEntity(KEY id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public KEY getId() {
        return id;
    }

    public void setId(KEY id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
            

    
}
