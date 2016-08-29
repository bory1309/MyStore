package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.City;


public interface CityRepository extends JpaRepository<City, Integer>{

	City findByName(String name);
	
	@Modifying
	@Query("DELETE FROM City c WHERE c.name=:name")
	void deleteByName(@Param("name") String name);
}
