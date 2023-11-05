package com.lmsstudbusters.lms.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface Subject {

    long getId();

    String getSubject();

    List<Class> getClasses();

    LocalDateTime getCreatedAt();

    Optional<LocalDateTime> getUpdatedAt();
}
