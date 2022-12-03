package application;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Person;


/**
 * Servlet implementation class ReadPersonsServlet
 */
public class ReadPersonsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadPersonsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read all persons from the database
		DBHandler dbHandler = new DBHandler();
		ArrayList<Person> persons = dbHandler.readPersons();
		// create a simple html string
		String result = "<html>";
		result += "<body>";
		result += "<h1>Persons</h1>";
		for (Person person : persons) {
			// create a p tag for each person
			result += "<p>"+person.getFirstName()+" "+person.getLastName()+"</p>";
		}
		result += "</body>";
		result += "</html>";
		// send the response to the browser
		response.getWriter().append(result);
	}

}
