package pl.DatabaseSubjects;

public class Car {
	int id;
	String brand;
	String model;
	int prod_year;
	
	public int getId() {
		return id;
	}
	
	public void setId (int id) {
		this.id=id;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getProd_year() {
		return prod_year;
	}
	
	public void setProd_year(int prod_year) {
		this.prod_year = prod_year;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int id, String brand, String model, int prod_year) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.brand=brand;
		this.model=model;
		this.prod_year=prod_year;
	}
	

}
