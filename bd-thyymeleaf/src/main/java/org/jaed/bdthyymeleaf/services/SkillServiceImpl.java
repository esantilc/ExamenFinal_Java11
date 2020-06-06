package org.jaed.bdthyymeleaf.services;

import java.util.List;

import org.jaed.bdthyymeleaf.model.Skill;
import org.jaed.bdthyymeleaf.proxy.SkillServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillServiceProxy proxy;
	
	@Override
	public List<Skill> findAll() {
		// TODO Auto-generated method stub
		return proxy.findAll();
	}

	@Override
	public Skill findById(Long id) {
		// TODO Auto-generated method stub
		return proxy.findById(id);
	}

}
