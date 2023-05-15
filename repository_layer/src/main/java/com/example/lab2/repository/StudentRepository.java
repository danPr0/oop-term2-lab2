package com.example.lab2.repository;

import com.example.lab2.entity.Category;
import com.example.lab2.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "students")
public interface StudentRepository extends CrudRepository<Student, Long> {

}