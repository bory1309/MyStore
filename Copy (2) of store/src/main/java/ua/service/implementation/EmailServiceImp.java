package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Email;
import ua.repository.EmailRepository;
import ua.service.EmailService;

@Service
public class EmailServiceImp implements EmailService{
	
	@Autowired
	private EmailRepository emailRepository;

	@Override
	public void save(String name) {
		Email email = new Email();
		email.setName(name);
		emailRepository.save(email);
		
	}

	@Override
	public Email findByName(String name) {
		return emailRepository.findByName(name);
	}

	
	@Override
	public List<Email> findAll() {
		return emailRepository.findAll();
	}

	@Override
	public void delete(String name) {
		
	}

	@Override
	public void deleteById(int id) {
		emailRepository.delete(id);
		
	}

}
