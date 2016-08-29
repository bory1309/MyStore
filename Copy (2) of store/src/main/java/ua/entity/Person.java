package ua.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private City city;
	
	@ManyToOne
	private Street street;
	
	private int building;
	

	private String tel_number;
	
	@ManyToOne
	private Email email;
	
	@ManyToOne
	private FirstName first_name;
	
	@ManyToOne
	private LastName last_name;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public int getBuilding() {
		return building;
	}

	public void setBuilding(int building) {
		this.building = building;
	}



	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public FirstName getFirst_name() {
		return first_name;
	}

	public void setFirst_name(FirstName first_name) {
		this.first_name = first_name;
	}

	public LastName getLast_name() {
		return last_name;
	}

	public void setLast_name(LastName last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}
	
	
	
}
