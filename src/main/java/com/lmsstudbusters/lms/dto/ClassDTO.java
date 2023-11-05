package com.lmsstudbusters.lms.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.lmsstudbusters.lms.model.Subject;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ClassDTO {

    private Subject subject;

    private LocalDateTime classDate;

    @JsonCreator
    public ClassDTO(final Subject subject, final LocalDateTime classDate)   {
        this.subject = subject;
        this.classDate = classDate;
    }
}
