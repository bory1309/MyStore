package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.FirstName;

public interface FirstNameRepository extends JpaRepository<FirstName, Integer>{
	
	FirstName findByName(String name);

}
