package com.developerservice.demo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "developer_skills")
public class DeveloperSkill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long developerId;
	private long skillsId;
		

	public long getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(long developerId) {
		this.developerId = developerId;
	}
	public long getSkillsId() {
		return skillsId;
	}
	public void setSkillsId(long skillsId) {
		this.skillsId = skillsId;
	}
	public DeveloperSkill() {
		// TODO Auto-generated constructor stub
	}
	public DeveloperSkill(long developerId, long skillsId) {// List<Skill> skills) {
		this.developerId = developerId;
		this.skillsId = skillsId;
	}


}
