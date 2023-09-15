package com.hoangminhng.lesson9.dao;

import com.hoangminhng.lesson9.entity.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AppDAO {
    void save(Instructor theInstructor);
}
