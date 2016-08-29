package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Shoes;

public interface ShoesRepository extends JpaRepository<Shoes, Integer>{

}
