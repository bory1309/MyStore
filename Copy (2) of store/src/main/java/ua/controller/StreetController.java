package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.StreetService;

@Controller
public class StreetController {
	
	@Autowired
	private StreetService streetService;
	
	
	@RequestMapping("/admin/street")
	public String showStreet(Model model){
		model.addAttribute("streets", streetService.findAll());
		return "adminStreet";
	}
	
	@RequestMapping(value="/admin/street/delete/{id}", method=RequestMethod.GET)
	public String deleteById(@PathVariable int id){
		streetService.deleteById(id);
		return "redirect:/admin/street";
	}
	
	@RequestMapping(value = "/admin/street/save")
	public String save(@RequestParam String name){
		streetService.save(name);
		return "redirect:/admin/street";
	}

}
