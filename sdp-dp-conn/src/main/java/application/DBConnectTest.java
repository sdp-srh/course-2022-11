package application;

import java.sql.Connection;
import java.util.ArrayList;

import data.Person;

public class DBConnectTest {

	public DBConnectTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Testing the DB connection");
		DBHandler dbh = new DBHandler();		
		dbh.deletePersons();
		writePersons();
		ArrayList<Person> persons = dbh.readPersons();
		for (Person p : persons) {
			System.out.println("Name: "+p.getLastName()+", "+p.getFirstName());
		}
	}
	
	public static void writePersons() {
		DBHandler dbh = new DBHandler();
		dbh.insertPerson(new Person("Donald", "Duck"));
		dbh.insertPerson(new Person("Mickey", "Mouse"));
	}
	
}
