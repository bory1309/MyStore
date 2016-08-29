package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	Brand findByName(String name);

}
