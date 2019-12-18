import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Login.do")
public class LoginServlet extends HttpServlet{
	
	InputDataService svcLogin=new InputDataService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//		InputDataService svcLogin=new InputDataService();
		
		System.out.println("START GET SERVICE");
//		if (request.getParameter("LastName")!=null){
		request.getSession().setAttribute("name", svcLogin.retriveData());
//		}
////		svcLogin.FirstName=request.getAttribute("FirstName");
//		System.out.println(svcLogin.FirstName);
		request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
//		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		System.out.println("END GET SERVICE");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException{
		System.out.println("START POST SERVICE");
		
		InputData dtLogin=new InputData();
		dtLogin.setFirstName(request.getParameter("FirstName"));
		dtLogin.setLastName(request.getParameter("LastName"));
		svcLogin.addToList(dtLogin);
		/*
		 * request.getSession().setAttribute("firstname", dtLogin.getFirstName());
		 * request.getSession().setAttribute("name", svcLogin.retriveData());
		 */
		//request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
		response.sendRedirect("/Login.do");
		System.out.println("END POST SERVICE");
	}
}
