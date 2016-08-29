package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.LastName;
import ua.repository.LastNameRepository;
import ua.service.LastNameService;

@Service
public class LastNameServiceImp implements LastNameService{

	@Autowired
	private LastNameRepository lastNameRepository;
	
	@Override
	public void save(String name) {
		LastName lastName = new LastName();
		lastName.setName(name);
		lastNameRepository.save(lastName);
	}


	@Override
	public LastName findByName(String name) {
		return lastNameRepository.findByName(name);
	}

	@Override
	public List<LastName> findAll() {
		return lastNameRepository.findAll();
	}
	
	@Override
		public void delete(String name) {
			
		}


	@Override
	public void deleteById(int id) {
		lastNameRepository.delete(id);
	}
	
}
