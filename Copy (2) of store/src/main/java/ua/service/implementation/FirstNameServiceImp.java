package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.FirstName;
import ua.repository.FirstNameRepository;
import ua.service.FirstNameService;

@Service
public class FirstNameServiceImp implements FirstNameService{
	
	@Autowired
	public FirstNameRepository firstNameRepository;
		
	
	@Override
	public void save(String name) {
		FirstName firstName = new FirstName();
		firstName.setName(name);
		firstNameRepository.save(firstName);
	}


	@Override
	public FirstName findByName(String name) {
		return firstNameRepository.findByName(name);
	}

	@Override
	public List<FirstName> findAll() {
		return firstNameRepository.findAll();
	}
	
	@Override
	public void delete(String name) {
	}


	@Override
	public void deleteById(int id) {
		firstNameRepository.delete(id);
	}

}
