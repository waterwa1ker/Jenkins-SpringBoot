package com.example.jenkins.services;

import com.example.jenkins.models.Example;
import com.example.jenkins.repositories.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }


    public List<Example> findAll() {
        return exampleRepository.findAll();
    }

    public Example findById(int id) {
        return exampleRepository.findById(id).orElse(null);
    }

    @Transactional
    public void delete(Example example) {
        exampleRepository.delete(example);
    }
}
