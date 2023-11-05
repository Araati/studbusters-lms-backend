package com.lmsstudbusters.lms.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@With
@Entity
@Table(name = "class")
public class ClassEntity {
    // предмет,
    // TODO: групп(Ы), преподаватель(И)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private SubjectEntity subject;

    private LocalDateTime classDate;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
