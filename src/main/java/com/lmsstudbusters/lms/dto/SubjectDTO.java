package com.lmsstudbusters.lms.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.lmsstudbusters.lms.model.entity.ClassEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class SubjectDTO {

    private String subject;

    private List<ClassEntity> classes;

    @JsonCreator
    public SubjectDTO(final String subject, final List<ClassEntity> classes)   {
        this.subject = subject;
        this.classes = classes;
    }
}
