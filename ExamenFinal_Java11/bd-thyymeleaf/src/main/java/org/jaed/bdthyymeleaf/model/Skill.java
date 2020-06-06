package org.jaed.bdthyymeleaf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String label;
    private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    public Skill() {
		// TODO Auto-generated constructor stub
	}
	public Skill(String label, String description) {
		this.label = label;
		this.description = description;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+" "+this.getLabel()+" "+this.getDescription();
	}
	
	
    
}
