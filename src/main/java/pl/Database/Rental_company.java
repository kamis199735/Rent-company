package pl.Database;
import pl.DatabaseSubjects.Car;
import pl.DatabaseSubjects.Customer;
import pl.DatabaseSubjects.Wypozyczenie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;




public class Rental_company {
	public static final String Driver="org.sql.JDBC";
	public static final String DB_URL="jdbc:sqlite:Rental_company.db";
	
	private Connection conn;
	private Statement stat;
	
	
	public Rental_company() {
		try {
			Class.forName(Rental_company.Driver);
		} catch (ClassNotFoundException e) {
			System.err.println("Nie znaleziono sterownika JDBC");
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(DB_URL);
			stat=conn.createStatement();
		} catch (SQLException e) {
			System.err.println("Problem z otwarciem polaczenia");
			e.printStackTrace();
		}
		createTables();
	}
	
	public boolean createTables() {
		String createCars="CREATE TABLE IF NOT EXISTS cars (id_car INTEGER PRIMARY KEY AUTOINCREAMENT, brand varchar(100), model varchar(100), prod_year int)";
		String createCustomers="CREATE TABLE IF NOT EXISTS customers (id_customer INTEGER PRIMARY KEY AUTOINCREMENT, imie varchar(100), nazwisko varchar(100), birth_year INTEGER)";
		String createWypozyczenia="CREAT TABLE IF NOT EXISTS wypozyczenia (id_wypozycznie INTEGER PRIMARY KEY AUTOINCREMENT, idCar int, idCustomer int)";
	try {
		stat.execute(createCars);
		stat.execute(createCustomers);
		stat.execute(createWypozyczenia);
	} catch (SQLException e) {
		System.err.println("Blad z tworzeniem tabel");
		e.printStackTrace();
		return false;
	}
	return true;
		
	}
	
/*	public boolean insertCar(String brand, String model, int prod_year) {
		try {
			PreparedStatement prpStat;
			prpStat=conn.prepareStatement("insert into cars values (NULL, ?, ?, ?");
			prpStat.setString(1, brand);
			prpStat.setString(2,  model);
			prpStat.setInt(3, prod_year);
			prpStat.execute();
		} catch (SQLException e) {
			System.err.println("Problem z zaladowaniem carsow");
			e.printStackTrace();
			return false;
		}
		return true;
		
		

	}
	
	public boolean insertCustomers (String imie, String nazwisko, int birth_year) {
		try {
			PreparedStatement prpStat=conn.prepareStatement("insert into customers values (NULL, ?, ?, ?)");
			prpStat.setString(1, imie);
			prpStat.setString(2, nazwisko);
			prpStat.setInt(3, birth_year);
			prpStat.execute();
		} catch (SQLException e) {
			System.err.println("Problem z zaladowaniem customersow");
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
 
	public boolean insertWypozyczenia(int idCar, int idCustomer) {
		try {
			PreparedStatement prpStat=conn.prepareStatement("insert into wypozyczenia values (null, ?, ?)");
			prpStat.setInt(1, idCar);
			prpStat.setInt(2, idCustomer);
			prpStat.execute();
		} catch (SQLException e) {
			System.err.println("Problem z zaladowaniem wypozyczen");
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
	public List<Car> selectCars() {
		List<Car> cars=new LinkedList<Car>();
		try {
			ResultSet result=stat.executeQuery("select * from cars");
			int id, prod_year;
			String brand, model;
			while(result.next()) {
				id=result.getInt("id_car");
				brand=result.getString("brand");
				model=result.getString("model");
				prod_year=result.getInt("prod_year");
				cars.add(new Car(id, brand, model, prod_year));
			} 
		} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			return cars;
		} */
		
	}

	


