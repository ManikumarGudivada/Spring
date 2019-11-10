import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Login.do")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		request.getRequestDispatcher("/spring1/src/main/webapp/WEB-INF/Login.jsp").forward(request, response);
//		request.getRequestDispatcher("/spring1/src/main/webapp/index.jsp").forward(request, response);
		
		
	}
}
