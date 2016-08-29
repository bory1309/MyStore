package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Brand;
import ua.entity.Color;
import ua.entity.Model;
import ua.entity.Season;
import ua.entity.Shoes;
import ua.repository.BrandRepository;
import ua.repository.ColorRepository;
import ua.repository.ModelRepository;
import ua.repository.SeasonRepository;
import ua.repository.ShoesRepository;
import ua.service.ShoesService;

@Service
public class ShoesServiceImp implements ShoesService{

	@Autowired
	private ShoesRepository shoesRepository;
	@Autowired
	private BrandRepository brandRepository; 
	@Autowired
	private ColorRepository colorRepository;
	@Autowired
	private ModelRepository modelRepository;
	@Autowired
	private SeasonRepository seasonRepository;
	
	@Override
	public void save(int modelId, int size, int colorId, int seasonId,
			int brandId, int price) {
		Shoes shoes = new Shoes();
		Brand brand = brandRepository.findOne(brandId);
		shoes.setBrand(brand);
		Model model = modelRepository.findOne(modelId);
		shoes.setModel(model);
		Color color = colorRepository.findOne(colorId);
		shoes.setColor(color);
		Season season = seasonRepository.findOne(seasonId);
		shoes.setSeason(season);
		shoes.setPrice(price);
		shoes.setSize(size);
		shoesRepository.save(shoes);
		
	}

	@Override
	public void delete() {
		
		
	}

	@Override
	public void deleteById(int id) {
		shoesRepository.delete(id);
	}

	@Override
	public Shoes findByModel(Model model) {
		
		return null;
	}

	@Override
	public List<Shoes> findAll() {
		return shoesRepository.findAll();
	}


}
