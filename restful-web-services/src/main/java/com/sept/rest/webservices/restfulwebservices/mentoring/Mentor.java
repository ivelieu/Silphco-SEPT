package com.sept.rest.webservices.restfulwebservices.mentoring;

import java.util.Date;


@Entity
public class Mentor {

	@Id
	@GeneratedValue
	private Long id;
	private float yearsWorked;
	private String companyWorkedFor;
	
	
	
	

	public Mentor() {
		super();
	}

	public Mentor(Long id, float yearsWorked, String companyWorkedFor) {
		super();
		this.id = id;
		this.yearsWorked = yearsWorked;
		this.companyWorkedFor = companyWorkedFor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(float yearsWorked) {
		this.yearsWorked = yearsWorked;
	}

	public String getCompanyWorkedFor() {
		return companyWorkedFor;
	}

	public void setCompanyWorkedFor(String companyWorkedFor) {
		this.companyWorkedFor = companyWorkedFor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mentor other = (Mentor) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
