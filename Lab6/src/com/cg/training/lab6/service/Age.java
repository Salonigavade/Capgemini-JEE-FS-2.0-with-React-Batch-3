package com.cg.training.lab6.service;

public class Age {

	private Integer id;
	private Integer PersonAge;
	
	
	public Age() {
		
	}


	public Age(Integer id, Integer personAge) {
		super();
		
		this.id = id;
		PersonAge = personAge;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPersonAge() {
		return PersonAge;
	}


	public void setPersonAge(Integer personAge) {
		PersonAge = personAge;
	}


	@Override
	public String toString() {
		return "Age [id=" + id + ", PersonAge=" + PersonAge + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PersonAge == null) ? 0 : PersonAge.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Age other = (Age) obj;
		if (PersonAge == null) {
			if (other.PersonAge != null)
				return false;
		} else if (!PersonAge.equals(other.PersonAge))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	

	
	
}
