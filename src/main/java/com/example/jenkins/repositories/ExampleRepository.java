package com.example.jenkins.repositories;

import com.example.jenkins.models.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Integer> {
}
