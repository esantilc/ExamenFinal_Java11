package org.jaed.bdthyymeleaf.controller;

import org.jaed.bdthyymeleaf.model.Developer;
import org.jaed.bdthyymeleaf.model.Skill;
import org.jaed.bdthyymeleaf.services.DeveloperService;
import org.jaed.bdthyymeleaf.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DevelopersController {

	@Autowired
	DeveloperService developerService;

	@Autowired
	SkillService skillService;

	@RequestMapping("/developer/{id}")
	public String developer(@PathVariable Long id, Model model) {
		model.addAttribute("developer", developerService.findById(id));
		model.addAttribute("skills", skillService.findAll());
		return "developer";
	}

	@RequestMapping(value="/developers",method=RequestMethod.GET)
	public String developersList(Model model) {
		model.addAttribute("developers", developerService.findAll());
		return "developers";
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String raiz(Model model) {
		model.addAttribute("developers", developerService.findAll());
		return "developers";
	}
	
	@RequestMapping(value="/developers",method=RequestMethod.POST)
	public String developersAdd(@RequestParam String email, 
						@RequestParam String firstName, @RequestParam String lastName, Model model) {
		Developer newDeveloper = new Developer();
		newDeveloper.setEmail(email);
		newDeveloper.setFirstName(firstName);
		newDeveloper.setLastName(lastName);
		developerService.save(newDeveloper);

		model.addAttribute("developer", newDeveloper);
		model.addAttribute("skills", skillService.findAll());
		return "redirect:/developer/" + newDeveloper.getId();
	}

	@RequestMapping(value="/developer/{id}/skills", method=RequestMethod.POST)
	public String developersAddSkill(@PathVariable Long id, @RequestParam Long skillId, Model model) {
		Skill skill = skillService.findById(skillId);
		Developer developer = developerService.findById(id);
		System.out.println(skill.toString());
		if (developer != null) {
			if (!developer.hasSkill(skill)) {
				developer.getSkills().add(skill);
			}
			developerService.save(developer);
			model.addAttribute("developer", developerService.findById(id));
			model.addAttribute("skills", skillService.findAll());
			return "redirect:/developer/" + developer.getId();
		}

		model.addAttribute("developers", developerService.findAll());
		return "redirect:/developers";
	}

}
