package com.adrianlascurain.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "education")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String institution;
	
	@Min(value = 0L,message = "Value must be positive")
	private Integer startDate;
	
	@Min(value = 0L,message = "Value must be positive")
	private Integer endDate;
	
	@Column(length = 1000)
	@Size(max = 1000)
	private String organizationImage;
	
	// Constructors
	public Education(String title, String institution,
			@Min(value = 0, message = "Value must be positive") Integer startDate,
			@Min(value = 0, message = "Value must be positive") Integer endDate,
			@Size(max = 1000) String organizationImage) {
		this.title = title;
		this.institution = institution;
		this.startDate = startDate;
		this.endDate = endDate;
		this.organizationImage = organizationImage;
	}
	
	public Education() {}
	
	// Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public Integer getStartDate() {
		return startDate;
	}

	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	public String getOrganizationImage() {
		return organizationImage;
	}

	public void setOrganizationImage(String organizationImage) {
		this.organizationImage = organizationImage;
	}
	
	// To string
	@Override
	public String toString() {
		return "Education [id=" + id + ", title=" + title + ", institution=" + institution + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", organizationImage=" + organizationImage + "]";
	}
	
}
