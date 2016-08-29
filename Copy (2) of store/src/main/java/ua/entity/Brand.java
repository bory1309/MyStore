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
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Fetch(FetchMode.SELECT)
	private String name;
	@OneToMany
	List<Shoes>shoes = new ArrayList<>();
	
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
	public List<Shoes> getShoes() {
		return shoes;
	}
	public void setShoes(List<Shoes> shoes) {
		this.shoes = shoes;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", shoes=" + shoes + "]";
	}
	
	

}
