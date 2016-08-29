package ua.service;

import java.util.List;

import ua.entity.City;
import ua.entity.Email;
import ua.entity.FirstName;
import ua.entity.LastName;
import ua.entity.Person;
import ua.entity.Street;

public interface PersonService{
	
	void save(City city, Street street, int building, String tel_number,
			Email email, int age, FirstName first_name, LastName last_name);
	
	Person findByName(String tel_number, int age);
	
	void deleteById(int id);
	
	List<Person> findAll();

	void save(int cityId, int streetId, int emailId, int first_nameId, int last_nameId, int buildind, int age);

}
