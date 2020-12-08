import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostExample
 */
@WebServlet("/PostExample")
public class PostExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PostExample() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set response headers
				response.setContentType("text/html");
				response.setCharacterEncoding("UTF-8");
				
				// create HTML form
				PrintWriter writer = response.getWriter();
				writer.append("<!DOCTYPE html>\r\n")
					  .append("<html>\r\n")
					  .append("		<head>\r\n")
					  .append("			<title>Form input</title>\r\n")
					  .append("		</head>\r\n")
					  .append("		<body style=\"background-color:powderblue;\">\r\n")
					  .append("			<form action=\"PostExample\" method=\"POST\">\r\n")
					  .append("				Enter your Number1: \r\n")
					  .append("				<input type=\"text\" name=\"n1\" /><br/>\r\n")
					  .append("				Enter your Number2: \r\n")
					  .append("				<input type=\"text\" name=\"n2\" /><br/>\r\n")
					  .append("				<input type=\"submit\" value=\"Submit\" />\r\n")
					  .append("			</form>\r\n")
					  .append("		</body>\r\n")
					  .append("</html>\r\n");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		Addition add = new Addition();
		int sum = add.add(Integer.parseInt(n1),Integer.parseInt(n2));
		//int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		// create HTML response
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n")
			  .append("<html>\r\n")
			  .append("		<head>\r\n")
			  .append("			<title>Welcome message</title>\r\n")
			  .append("		</head>\r\n")
			  .append("		<body>\r\n");
		writer.append(" The sum is : " + Integer.toString(sum));
		writer.append("		</body>\r\n")
			  .append("</html>\r\n");

	}

}
