package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.LastNameService;

@Controller
public class LastNameController {
	
	@Autowired
	private LastNameService lastNameServ;
	
	@RequestMapping("/admin/last_name")
	public String showLastName(Model model){
		model.addAttribute("last_names", lastNameServ.findAll());
		return "adminLastName";
	}
	
	@RequestMapping(value="/admin/last_name/save", method=RequestMethod.POST)
	public String saveLastName(@RequestParam String name){
		lastNameServ.save(name);
		return "redirect:/admin/last_name";
	}
	
	@RequestMapping(value="/admin/last_name/delete/{id}", method=RequestMethod.GET)
	public String deleteLastName(@PathVariable int id){
		lastNameServ.deleteById(id);
		return "redirect:/admin/last_name";
	}
	
	

}
