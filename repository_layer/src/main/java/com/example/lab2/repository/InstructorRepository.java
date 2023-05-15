package com.example.lab2.repository;

import com.example.lab2.entity.Group;
import com.example.lab2.entity.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "instructors")
public interface InstructorRepository extends CrudRepository<Instructor, Long> {

}