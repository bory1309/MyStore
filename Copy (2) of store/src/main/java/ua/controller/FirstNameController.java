package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.FirstNameService;

@Controller
public class FirstNameController {
	
	@Autowired
	private FirstNameService firstNameServ;
	
	@RequestMapping("/admin/first_name")
	public String showFirstName(Model model){
		model.addAttribute("first_names", firstNameServ.findAll());
		return "adminFirstName";
	}
	
	@RequestMapping(value="/admin/first_name/delete/{id}",  method=RequestMethod.GET)
	public String deleteById(@PathVariable int id){
		firstNameServ.deleteById(id);
		return "redirect:/admin/first_name";
	}
	
	@RequestMapping(value="/admin/first_name/save", method=RequestMethod.POST)
	public String saveFirstName(@RequestParam String name){
		firstNameServ.save(name);
		return "redirect:/admin/first_name";
	}

}
