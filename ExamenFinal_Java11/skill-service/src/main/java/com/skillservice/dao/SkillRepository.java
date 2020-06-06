package com.skillservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillservice.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}