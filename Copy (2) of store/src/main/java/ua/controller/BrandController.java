package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.BrandService;


@Controller
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/adminShoes/brand")
	public String showBrand(Model model){
		model.addAttribute("brands", brandService.findAll());
		return "brand";
	}
	
	@RequestMapping("/adminShoes/brand/save")
	public String saveBrand(@RequestParam String name){
		brandService.save(name);
		return "redirect:/adminShoes/brand";
	}
	
	@RequestMapping(value="/adminShoes/brand/delete/{id}", method=RequestMethod.GET)
	public String deleteBrand(@PathVariable int id){
		brandService.deleteById(id);
		return "redirect:/adminShoes/brand";
	}
	

}
