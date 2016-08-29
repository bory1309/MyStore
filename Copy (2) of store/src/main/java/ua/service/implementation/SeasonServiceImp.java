package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Season;
import ua.repository.SeasonRepository;
import ua.service.SeasonService;

@Service
public class SeasonServiceImp implements SeasonService{
	
	@Autowired
	private SeasonRepository seasonRepository;

	@Override
	public void save(String name) {
		Season season = new Season();
		season.setName(name);
		seasonRepository.save(season);
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		seasonRepository.delete(id);
	}

	@Override
	public Season findByName(String name) {
		return seasonRepository.findByName(name);
	}

	@Override
	public List<Season> findAll() {
		return seasonRepository.findAll();
	}

}
