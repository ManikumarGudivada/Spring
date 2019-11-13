import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Login.do")
public class LoginServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		System.out.println("login servlet");
//		request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		System.out.println("DIspatcher complete");
		
	}
}
