package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.ModelService;

@Controller
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	@RequestMapping("/adminShoes/model")
	public String showModel(Model model){
		model.addAttribute("models", modelService.findAll());
		return "model";
	}
	
	@RequestMapping(value="/adminShoes/model/save", method=RequestMethod.POST)
	public String saveModel(@RequestParam String name){
		modelService.save(name);
		return "redirect:/adminShoes/model";
	}
	
	@RequestMapping(value="/adminShoes/model/delete/{id}", method=RequestMethod.GET)
	public String deleteModel(@PathVariable int id){
		modelService.deleteById(id);
		return "redirect:/adminShoes/model";
	}

}
