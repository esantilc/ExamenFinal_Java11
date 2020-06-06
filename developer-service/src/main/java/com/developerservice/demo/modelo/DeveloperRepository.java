package com.developerservice.demo.modelo;


import org.springframework.data.repository.CrudRepository;
import com.developerservice.demo.entidad.Developer;

public interface DeveloperRepository 
             extends CrudRepository<Developer, Long> {

}
