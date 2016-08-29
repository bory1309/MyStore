package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.CityService;
import ua.service.EmailService;
import ua.service.FirstNameService;
import ua.service.LastNameService;
import ua.service.PersonService;
import ua.service.StreetService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private CityService cityService;
	@Autowired 
	private StreetService streetService;
	@Autowired
	private EmailService emailService;
	@Autowired
	private FirstNameService firstNameService;
	@Autowired
	private LastNameService lastNameService;
	
	@RequestMapping("admin/person")
	public String showPerson(Model model){
		model.addAttribute("persons", personService.findAll());
		model.addAttribute("cities", cityService.findAll());
		model.addAttribute("streets", streetService.findAll());
		model.addAttribute("emails", emailService.findAll());
		model.addAttribute("first_names", firstNameService.findAll());
		model.addAttribute("last_names", lastNameService.findAll());
		return "adminPerson";
	}

	@RequestMapping(value= "/admin/person", method=RequestMethod.POST)
	public String savePerson(@RequestParam int cityId, @RequestParam int streetId, @RequestParam int emailId, 
			@RequestParam int first_nameId, @RequestParam int last_nameId, @RequestParam int building,
			@RequestParam int age){
		personService.save(cityId, streetId, emailId, first_nameId, last_nameId, building, age);
		return "redirect:/admin/person";
	}
	
	@RequestMapping(value= "/admin/person/delete/{id}", method=RequestMethod.GET)
	public String deletePersonByID(@PathVariable int id){
		personService.deleteById(id);
		return "redirect:/admin/person";
	}

}
