package com.lmsstudbusters.lms.controller;

import com.lmsstudbusters.lms.facade.SubjectFacade;
import com.lmsstudbusters.lms.model.Subject;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectConroller {
    private final SubjectFacade subjectFacade;

    @PostMapping
    public Subject create(@Valid @RequestBody final ContributionCreateDTO request)   {
        return contributionFacade.create(request);
    }
}
