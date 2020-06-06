package org.jaed.bdthyymeleaf.proxy;

import java.util.List;

import org.jaed.bdthyymeleaf.entidad.Skill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="skill-service")
public interface SkillServiceProxy {

	@GetMapping("/skills")
	public List<Skill> findAll();

	@GetMapping("/skills/{id}")
	public Skill findById(Long id);
	
}
