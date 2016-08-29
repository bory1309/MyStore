package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Color;
import ua.repository.ColorRepository;
import ua.service.ColorService;

@Service
public class ColorServiceImp implements ColorService{
	
	@Autowired
	private ColorRepository colorRepository;

	@Override
	public void save(String name) {
		Color color = new Color();
		color.setName(name);
		colorRepository.save(color);
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		colorRepository.delete(id);
	}

	@Override
	public Color findByName(String name) {
		return colorRepository.findByName(name);
	}

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}

}
