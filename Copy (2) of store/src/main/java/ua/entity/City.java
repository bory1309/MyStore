package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	private String name;
	@OneToMany(mappedBy="city")
	List<Person>persons = new ArrayList<>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", persons=" + persons
				+ "]";
	}


	
}
