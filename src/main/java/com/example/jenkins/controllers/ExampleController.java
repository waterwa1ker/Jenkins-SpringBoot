package com.example.jenkins.controllers;

import com.example.jenkins.models.Example;
import com.example.jenkins.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        Example example = exampleService.findById(id);
        if (example == null) {
            return ResponseEntity.ok("Example not found");
        }
        exampleService.delete(example);
        return ResponseEntity.ok("Succeed!");
    }

}
