package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterController() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		String mobile=request.getParameter("mobile");
		String uname=request.getParameter("username");
		String password=request.getParameter("pass");
		String repassword=request.getParameter("repass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_cartShopping","root","Rk@mysql09");
			PreparedStatement ps=connect.prepareStatement("insert into customerdata (name,email,mobilenumber,username,password,repassword) values (?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,mail);
			ps.setString(3,mobile);
			ps.setString(4,uname);
			ps.setString(5,password);
			ps.setString(6,repassword);
			
			int status=ps.executeUpdate();
			if(status>0)
			{
				out.println("<h1 style='color:green'>Your Record Registerd Successfully...You Can Login..</h1>");
				request.getRequestDispatcher("/login.jsp").include(request, response);
			}
			else {
				out.println("<h1 style='color:red'>Your Record Not Registerd ...pls, try again ...</h1>");
				request.getRequestDispatcher("/register.jsp").include(request, response);
			}
			
		}catch(ClassNotFoundException |SQLException e)
		{
			out.println(e);
		}
		
	}

}
