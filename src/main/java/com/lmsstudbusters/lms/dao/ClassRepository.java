package com.lmsstudbusters.lms.dao;

import com.lmsstudbusters.lms.model.entity.ClassEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClassRepository extends CrudRepository<ClassEntity, Long> {
}
