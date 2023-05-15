package com.example.lab2.repository;

import com.example.lab2.entity.Group;
import com.example.lab2.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "groups")
public interface GroupRepository extends CrudRepository<Group, Long> {

}