package org.jaed.bdthyymeleaf.services;

import java.util.List;

import org.jaed.bdthyymeleaf.model.Developer;

public interface DeveloperService {

	Developer findById(Long id);

	List<Developer> findAll();

	void save(Developer developer);
}
