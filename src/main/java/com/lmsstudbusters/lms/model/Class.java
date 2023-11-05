package com.lmsstudbusters.lms.model;

import java.time.LocalDateTime;
import java.util.Optional;

public interface Class {

    long getId();

    Subject getSubject();

    LocalDateTime getClassDate();

    LocalDateTime getCreatedAt();

    Optional<LocalDateTime> getUpdatedAt();
}
