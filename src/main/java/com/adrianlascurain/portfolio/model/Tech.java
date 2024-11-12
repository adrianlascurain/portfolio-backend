package com.adrianlascurain.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tech")
public class Tech {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(length = 1000)
	@Size(max = 1000)
	private String image;

	// Constructors
	public Tech(String name, @Size(max = 1000) String image) {
		this.name = name;
		this.image = image;
	}
	
	public Tech() {}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	// To string
	@Override
	public String toString() {
		return "Tech [id=" + id + ", name=" + name + ", image=" + image + "]";
	}
	
}
