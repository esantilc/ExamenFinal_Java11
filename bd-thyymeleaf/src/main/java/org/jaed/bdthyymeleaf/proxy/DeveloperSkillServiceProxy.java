package org.jaed.bdthyymeleaf.proxy;

import java.util.List;
import java.util.Optional;

import org.jaed.bdthyymeleaf.model.Developer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.developerservice.demo.entidad.DeveloperSkill;

@FeignClient(name="developer-skill-service")
@RibbonClient(name="developer-skill-service")
public interface DeveloperSkillServiceProxy {

	@GetMapping("/developer/{id}/skill")
	public Optional<DeveloperSkill> developer(@PathVariablLong id);
	
	@GetMapping(value="/developersskill")
	public List<DeveloperSkill> developersList() {
	
	
	@GetMapping("/developers")
	public List<Developer> findAll();
	
	@GetMapping("/developer/{id}")
	public Developer findById(@PathVariable Long id);
	
	@PostMapping("/save")
	public void save(@RequestBody Developer developer);
}
