package application;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Person;

/**
 * Servlet implementation class CreatePerson
 */
public class CreatePerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		Person person = new Person(firstName, lastName);
		DBHandler dbHandler = new DBHandler();
		dbHandler.insertPerson(person);
		response.getWriter().append("Created Person ("+lastName+", "+firstName+")");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// here we can implement a post method.
		// post can contain more data than get
		// e.g. post is used to send images or other files

	}

}
