package org.jaed.bdthyymeleaf.proxy;

import java.util.List;

import org.jaed.bdthyymeleaf.model.Developer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="developer-service")
@RibbonClient(name="developer-service")
public interface DeveloperServiceProxy {

	@GetMapping("/developers")
	public List<Developer> findAll();
	
	@GetMapping("/developer/{id}")
	public Developer findById(@PathVariable Long id);
	
	@PostMapping("/save")
	public Developer save(@RequestBody Developer developer);
}
