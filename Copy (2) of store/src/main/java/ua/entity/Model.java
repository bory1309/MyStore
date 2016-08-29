package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Model {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Fetch(FetchMode.SELECT)
	private String name;
	@OneToMany
	List<Shoes>shoes = new ArrayList<>();
	
	public List<Shoes> getShoes() {
		return shoes;
	}
	public void setShoes(List<Shoes> shoes) {
		this.shoes = shoes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", shoes=" + shoes + "]";
	}
	
	
	
}
