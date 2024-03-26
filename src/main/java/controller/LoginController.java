package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
     
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("username");
		String password=request.getParameter("pass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_cartShopping","root","Rk@mysql09");
			PreparedStatement ps=connect.prepareStatement("select * from customerdata ");
			ResultSet result=ps.executeQuery();
			int fact=0;
				while(result.next())
				{
					String dbuname=result.getString("username");
					String dbname=result.getString("name");
					String dbpass=result.getString("password");
				
				if(uname.equals(dbuname) &&password.equals(dbpass))
					
				{
					HttpSession session=request.getSession();
					session.setAttribute("sname", dbname);
					
					request.getRequestDispatcher("/UserHome.jsp").forward(request, response);
				fact=1;
				}
				}
				if(fact==0) 
				{
					out.println("<h1 style='color:red	'>please, enter valid username/ password...</h1>");
					request.getRequestDispatcher("/login.jsp").include(request, response);
				}
				
		
		}catch(ClassNotFoundException | SQLException e)
		{
			out.println(e);
		}
		
		
		
	}

}
