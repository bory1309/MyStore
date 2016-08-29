package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Brand;
import ua.repository.BrandRepository;
import ua.service.BrandService;

@Service
public class BrandServiceImp implements BrandService{

	@Autowired
	private BrandRepository brandRepository; 
	
	@Override
	public void save(String name) {
		Brand brand = new Brand();
		brand.setName(name);
		brandRepository.save(brand);
		
	}

	@Override
	public void delete(String name) {
	}

	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

	@Override
	public Brand findBYName(String name) {
		return brandRepository.findByName(name);
	}

	@Override
	public void deleteById(int id) {
		brandRepository.delete(id);
		
	}

}
