package ua.service.implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.City;
import ua.repository.CityRepository;
import ua.service.CityService;

@Service
public class CityServiceImp implements CityService{
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public void save(String name) {
		City city = new City();
		city.setName(name);
		cityRepository.save(city);
		
	}

	@Override
	public City findByName(String name) {
		return cityRepository.findByName(name);
	}



	@Override
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@Override
	public void delete(String name) {
		cityRepository.deleteByName(name);
	}

	@Override
	public void deleteById(int id) {
		cityRepository.delete(id);
		
	}


	
	
	
}
