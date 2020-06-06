package org.jaed.bdthyymeleaf.repository;

import java.util.List;

import org.jaed.bdthyymeleaf.entidad.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Long> {
	public List<Skill> findByLabel(String label);
}
