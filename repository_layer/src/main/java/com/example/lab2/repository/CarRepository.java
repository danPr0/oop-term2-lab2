package com.example.lab2.repository;

import com.example.lab2.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cars")
public interface CarRepository extends CrudRepository<Car, Long> {
}
