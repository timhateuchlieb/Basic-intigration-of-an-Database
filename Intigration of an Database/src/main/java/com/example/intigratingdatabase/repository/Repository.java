package com.example.intigratingdatabase.repository;

import com.example.intigratingdatabase.model.Entity;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Entity, Integer> {
}
