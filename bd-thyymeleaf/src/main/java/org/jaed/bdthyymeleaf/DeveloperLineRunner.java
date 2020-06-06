package org.jaed.bdthyymeleaf;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.jaed.bdthyymeleaf.entidad.Developer;
import org.jaed.bdthyymeleaf.entidad.Skill;
import org.jaed.bdthyymeleaf.repository.DeveloperRepository;
import org.jaed.bdthyymeleaf.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//@Component
public class DeveloperLineRunner implements CommandLineRunner {

    @Autowired
    DeveloperRepository developerRepository;

    @Autowired
    SkillRepository skillRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Skill javascript = new Skill("javascript", "Javascript language skill");
		Skill ruby = new Skill("ruby", "Ruby language skill");
		Skill emberjs = new Skill("emberjs", "Emberjs framework");
		Skill angularjs = new Skill("angularjs", "Angularjs framework");

		skillRepository.save(javascript);
		skillRepository.save(ruby);
		skillRepository.save(emberjs);
		skillRepository.save(angularjs);

		List<Developer> developers = new LinkedList<Developer>();
		developers.add(new Developer("John", "Smith", "john.smith@example.com", 
				Arrays.asList(new Skill[] { javascript, ruby })));
		developers.add(new Developer("Mark", "Johnson", "mjohnson@example.com", 
				Arrays.asList(new Skill[] { emberjs, ruby })));
		developers.add(new Developer("Michael", "Williams", "michael.williams@example.com", 
				Arrays.asList(new Skill[] { angularjs, ruby })));
		developers.add(new Developer("Fred", "Miller", "f.miller@example.com", 
				Arrays.asList(new Skill[] { emberjs, angularjs, javascript })));
		developers.add(new Developer("Bob", "Brown", "brown@example.com", 
				Arrays.asList(new Skill[] { emberjs })));
		developerRepository.saveAll(developers);*/

	}

}
