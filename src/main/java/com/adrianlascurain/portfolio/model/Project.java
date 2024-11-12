package com.adrianlascurain.portfolio.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	@Column(length = 1000)
	@Size(max = 1000)
	private String description;
	
	@Column(length = 1000)
	@Size(max = 1000)
	private String image;
	
	@Column(length = 1000)
	@Size(max = 1000)
	private String gif;
	
	@ElementCollection
	private List<String> frontTechs;
	
	@ElementCollection
	private List<String> backTechs;
	
	
	
}
