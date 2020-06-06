package com.developerservice.demo.modelo;


import org.springframework.data.repository.CrudRepository;
import com.developerservice.demo.entidad.DeveloperSkill;

public interface DeveloperSkillRepository 
             extends CrudRepository<DeveloperSkill, Long> {

}
