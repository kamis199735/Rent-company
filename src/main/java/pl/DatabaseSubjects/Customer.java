package pl.DatabaseSubjects;
import java.util.Calendar;


public class Customer {
	int id;
	String imie;
	String nazwisko;
	public int birth_year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}
	
	public boolean czyPelnoletni() {
		if(Calendar.getInstance().get(Calendar.YEAR)-birth_year>18) {
			return true;
		}
		return false;
			
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String imie, String nazwisko, int birth_year) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.birth_year=birth_year;
	}

}
