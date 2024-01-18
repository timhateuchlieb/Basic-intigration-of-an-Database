package com.example.intigratingdatabase.controller;

import com.example.intigratingdatabase.model.Entity;
import com.example.intigratingdatabase.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    public final Repository repository;

    @GetMapping
    public String getHello(){
        Entity helloEntity = repository.save(new Entity("hello"));
        return "Hello         " + helloEntity.getCounter() ;

    }
}
