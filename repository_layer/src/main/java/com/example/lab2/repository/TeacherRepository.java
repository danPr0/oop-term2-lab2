package com.example.lab2.repository;

import com.example.lab2.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teachers")
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

}