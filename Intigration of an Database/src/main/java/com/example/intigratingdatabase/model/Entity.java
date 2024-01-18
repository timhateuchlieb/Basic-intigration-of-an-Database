package com.example.intigratingdatabase.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer counter;

    private String hello;

    public Entity(String hello){
        this.hello = hello;
    }


}
