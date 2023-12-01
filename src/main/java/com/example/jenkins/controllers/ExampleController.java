package com.example.jenkins.controllers;

import com.example.jenkins.models.Example;
import com.example.jenkins.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examples")
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping
    public List<Example> findAll(){
        return exampleService.findAll();
    }

    @GetMapping("/{id}")
    public Example findById(@PathVariable int id){
        return exampleService.findById(id);
    }

}
