package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.LastName;

public interface LastNameRepository extends JpaRepository<LastName, Integer>{
	
	LastName findByName(String name);

}
