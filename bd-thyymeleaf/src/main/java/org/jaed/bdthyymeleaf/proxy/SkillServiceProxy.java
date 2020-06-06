package org.jaed.bdthyymeleaf.proxy;

import java.util.List;

import org.jaed.bdthyymeleaf.model.Skill;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="skill-services")
@RibbonClient(name="skill-services")
public interface SkillServiceProxy {

	@GetMapping("/skills")
	public List<Skill> findAll();

	@GetMapping("/skills/{id}")
	public Skill findById(@PathVariable Long id);
	
}
