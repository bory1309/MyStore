package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Model;
import ua.repository.ModelRepository;
import ua.service.ModelService;

@Service
public class ModelServiceImp implements ModelService{
	
	@Autowired
	private ModelRepository modelRepository;

	@Override
	public void save(String name) {
		Model model = new Model();
		model.setName(name);
		modelRepository.save(model);
	}

	@Override
	public void delete(String name) {	
	}

	@Override
	public void deleteById(int id) {
		modelRepository.delete(id);
	}

	@Override
	public Model findByName(String name) {
		return modelRepository.findByName(name);
	}

	@Override
	public List<Model> findAll() {
		return modelRepository.findAll();
	}
	

}
