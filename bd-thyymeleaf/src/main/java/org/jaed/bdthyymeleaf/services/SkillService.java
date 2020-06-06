package org.jaed.bdthyymeleaf.services;

import java.util.List;

import org.jaed.bdthyymeleaf.entidad.Skill;

public interface SkillService {

	List<Skill> findAll();

	Skill findById(Long id);
}
