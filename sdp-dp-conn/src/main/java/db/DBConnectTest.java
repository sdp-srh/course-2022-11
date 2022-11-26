package db;

import java.util.ArrayList;

import data.Person;

public class DBConnectTest {

	public DBConnectTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Testing the DB connection");
		// Connection c = DBHandler.getConnection();
		DBHandler dbh = new DBHandler();
		ArrayList<Person> persons = dbh.readPersons();
		for (Person p : persons) {
			System.out.println("Name: "+p.getLastName());
		}
		
	}

}
