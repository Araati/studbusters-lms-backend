package com.lmsstudbusters.lms.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@With
@Entity
@Table(name = "subject")
public class SubjectEntity {
    // название, занятия
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String subject;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ClassEntity> classes;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
