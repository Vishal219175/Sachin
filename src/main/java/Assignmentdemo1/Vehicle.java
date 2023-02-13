package Assignmentdemo1;

public class Vehicle {

	private int id;
	private String name;
	private String country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Vehicle(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
