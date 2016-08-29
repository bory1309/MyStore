package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Integer>{
	
	Email findByName(String name);

}
