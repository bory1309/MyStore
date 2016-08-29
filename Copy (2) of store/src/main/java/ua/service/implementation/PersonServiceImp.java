package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.City;
import ua.entity.Email;
import ua.entity.FirstName;
import ua.entity.LastName;
import ua.entity.Person;
import ua.entity.Street;
import ua.repository.CityRepository;
import ua.repository.EmailRepository;
import ua.repository.FirstNameRepository;
import ua.repository.LastNameRepository;
import ua.repository.PersonRepository;
import ua.repository.StreetRepository;
import ua.service.PersonService;

@Service
public class PersonServiceImp implements PersonService{
	
	@Autowired
	public PersonRepository personRepository;
	@Autowired
	public CityRepository cityRepository;
	@Autowired
	public StreetRepository streetRepository;
	@Autowired
	public EmailRepository emailRepository;
	@Autowired
	public FirstNameRepository firstNameRepository;
	@Autowired
	public LastNameRepository lastNameRepository;


	@Override
	public void save(int cityId, int streetId, int emailId, int first_nameId, int last_nameId,
			int building, int age) {
		Person person = new Person();
		City city = cityRepository.findOne(cityId);
		person.setCity(city);
		Street street = streetRepository.findOne(streetId);
		person.setStreet(street);
		Email email = emailRepository.findOne(emailId);
		person.setEmail(email);
		FirstName first_name = firstNameRepository.findOne(first_nameId);
		person.setFirst_name(first_name);
		LastName last_name = lastNameRepository.findOne(last_nameId);
		person.setLast_name(last_name);
		person.setAge(age);
		person.setBuilding(building);
		personRepository.save(person);
	}

	

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}



	@Override
	public Person findByName(String tel_number, int age) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void save(City city, Street street, int building, String tel_number,
			Email email, int age, FirstName first_name, LastName last_name) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteById(int id) {
		personRepository.delete(id);
		
	}





}
