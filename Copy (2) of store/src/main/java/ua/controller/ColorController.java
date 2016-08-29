package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.ColorService;

@Controller
public class ColorController {
	
	@Autowired
	private ColorService colorService;
	
	@RequestMapping("/adminShoes/color")
	public String showColor(Model model){
		model.addAttribute("colors", colorService.findAll());
		return "color";
	}
	
	@RequestMapping(value ="/adminShoes/color/save", method=RequestMethod.POST)
	public String saveColor(@RequestParam String name){
		colorService.save(name);
		return "redirect:/adminShoes/color";
	}
	
	@RequestMapping(value ="/adminShoes/color/delete/{id}", method=RequestMethod.GET)
	public String deleteColor(@PathVariable int id){
		colorService.deleteById(id);
		return "redirect:/adminShoes/color";
	}

}
