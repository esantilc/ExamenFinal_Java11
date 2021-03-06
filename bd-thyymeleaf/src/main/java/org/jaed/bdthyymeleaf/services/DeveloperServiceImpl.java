package org.jaed.bdthyymeleaf.services;

import java.util.List;

import org.jaed.bdthyymeleaf.model.Developer;
import org.jaed.bdthyymeleaf.proxy.DeveloperServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	private DeveloperServiceProxy proxy;
	
	@Override
	public Developer findById(Long id) {
		// TODO Auto-generated method stub
		return proxy.findById(id);
	}

	@Override
	public List<Developer> findAll() {
		// TODO Auto-generated method stub
		return proxy.findAll();
	}

	@Override
	public Developer save(Developer developer) {
		return proxy.save(developer);
		
	}

}
