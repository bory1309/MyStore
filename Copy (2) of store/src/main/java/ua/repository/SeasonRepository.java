package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Season;

public interface SeasonRepository extends JpaRepository<Season, Integer>{
	
	Season findByName(String name);

}
