package junit;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import application.DBHandler;
import data.Person;

public class DBHandlerTest {
	public Person getTestPerson() {
		return new Person("FirstNameTest", "LastNameTest");
	}
	
	@Test
	public void testInsertPerson() {
		// we create a person and insert in DB
		Person testPerson = getTestPerson();
		DBHandler dbh = new DBHandler();
		dbh.insertPerson(testPerson);
		
		// now we check that the person is available in the database
		ArrayList<Person> persons = dbh.readPersons();
		boolean testUserExists = false;
		for (Person person: persons) {
			if (person.getFirstName().equals(testPerson.getFirstName())
				&& person.getLastName().equals(testPerson.getLastName())) {
				testUserExists = true;
			}
		}
		if (!testUserExists) {
			fail("test User not created in the database");	
		}
	}
}
