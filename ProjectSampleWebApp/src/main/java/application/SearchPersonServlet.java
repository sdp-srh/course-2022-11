package application;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import data.Person;

/**
 * Servlet implementation class SearchPersonServlet
 */
@WebServlet({ "/SearchPersonServlet", "/search" })
public class SearchPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String searchTerm = request.getParameter("term");
		System.out.println(searchTerm);
		if (searchTerm == null) {
			response.getWriter().write("No Search Term provided");
		}
		else {
			DBHandler dbHandler = new DBHandler();
			ArrayList<Person> persons = dbHandler.searchPersons(searchTerm);			
			Gson gson = new Gson();
			String jsonString = gson.toJson(persons);
			response.getWriter().append(jsonString);
		}
	}

}
