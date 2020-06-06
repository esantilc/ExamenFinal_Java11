package org.jaed.bdthyymeleaf.services;

import java.util.List;

import org.jaed.bdthyymeleaf.model.Skill;

public interface SkillService {

	List<Skill> findAll();

	Skill findById(Long id);
}
