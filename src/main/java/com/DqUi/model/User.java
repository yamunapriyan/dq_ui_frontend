package com.DqUi.model;

//import ;




import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;



@Data
public class User {

    @Id
    public Long id;
    String emailId,password;

    @CreatedDate
    LocalDateTime dateCreated;

    @LastModifiedDate
    LocalDateTime lastUpdated;

    @PrePersist
    public void onPrePersist(){
        this.dateCreated = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        this.lastUpdated = LocalDateTime.now();
    }
}
