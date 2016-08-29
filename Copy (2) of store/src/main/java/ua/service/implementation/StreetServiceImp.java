package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Street;
import ua.repository.StreetRepository;
import ua.service.StreetService;


@Service
public class StreetServiceImp implements StreetService{

	@Autowired
	private StreetRepository streetRepository;
	
	@Override
	public void save(String name) {
		Street street = new Street();
		street.setName(name);
		streetRepository.save(street);
		
	}

	@Override
	public Street findByName(String name) {
		return streetRepository.findByName(name);
	}

	@Override
	public List<Street> findAll() {
		return streetRepository.findAll();
	}
	
	@Override
		public void delete(String name) {
		}

	@Override
	public void deleteById(int id) {
		streetRepository.delete(id);
	}
	
}
