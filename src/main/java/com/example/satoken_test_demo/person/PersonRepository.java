package com.example.satoken_test_demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {
}