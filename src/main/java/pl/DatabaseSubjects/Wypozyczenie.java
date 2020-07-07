package pl.DatabaseSubjects;

public class Wypozyczenie {
	int id;
	int idCar;
	int idCustomer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	
	public Wypozyczenie() {
		// TODO Auto-generated constructor stub
	}
	
	public Wypozyczenie(int id, int idCar, int idCustomer) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.idCar=idCar;
		this.idCustomer=idCustomer;
	}

}
