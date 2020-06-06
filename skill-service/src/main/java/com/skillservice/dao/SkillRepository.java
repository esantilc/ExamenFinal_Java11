package com.skillservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.skillservice.model.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long> {
}