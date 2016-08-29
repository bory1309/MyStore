package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/admin/email")
	public String showEmail(Model model){
		model.addAttribute("emails", emailService.findAll());
		return "adminEmail";
	}
	
	@RequestMapping(value="/admin/email/delete/{id}",  method=RequestMethod.GET)
		public String deleteById(@PathVariable int id){
			emailService.deleteById(id);
			return "redirect:/admin/email";
		}
	
	@RequestMapping(value="/admin/email/save", method=RequestMethod.POST)
	public String saveEmail(@RequestParam String name){
		emailService.save(name);
		return "redirect:/admin/email";
	}
		
		
	
}
