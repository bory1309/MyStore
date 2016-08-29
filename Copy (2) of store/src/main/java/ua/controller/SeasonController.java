package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.SeasonService;

@Controller
public class SeasonController {
	
	@Autowired
	private SeasonService seasonService;
	
	@RequestMapping("/adminShoes/season")
	public String showSeason(Model model){
		model.addAttribute("seasons", seasonService.findAll());
		return "season";
	}
	
	@RequestMapping(value="/adminShoes/season/save", method=RequestMethod.POST)
	public String saveSeason(@RequestParam String name){
		seasonService.save(name);
		return "redirect:/adminShoes/season";
	}
	
	@RequestMapping(value="/adminShoes/season/delete/{id}", method=RequestMethod.GET)
	public String deleteSeason(@PathVariable int id){
		seasonService.deleteById(id);
		return "redirect:/adminShoes/season";
	}
}
