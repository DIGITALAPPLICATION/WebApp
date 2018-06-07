import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class LoginServlet extends HttpServlet {
 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
			  
		String inputUname = request.getParameter("username");  
		String inputPwd = request.getParameter("userpwd");

		System.out.println("inputUname: "+inputUname);
		System.out.println("inputPwd: "+inputPwd);
		

		if(userCheck(inputUname,inputPwd)){
			RequestDispatcher rd=request.getRequestDispatcher("welcomeServlet");  
			rd.forward(request,response);  
		}  
		else{  
			out.print("<h1><font color=red>Sorry username or password error</font></h1>");  
			RequestDispatcher rd=request.getRequestDispatcher("LoginPage.html");  
			rd.include(request,response);  
		}  

	out.close();  
	}
	
	public boolean userCheck(String inputUname, String inputPwd){
		
		boolean bln = false;
		
		String expectedUname1 = "devops2018";
		String expectedPwd1 = "devops@2018";

		String expectedUname2 = "devops2019";
		String expectedPwd2 = "devops@2019";
		
		if((inputUname.equalsIgnoreCase(expectedUname1) && inputPwd.equals(expectedPwd1)) || (inputUname.equalsIgnoreCase(expectedUname2) && inputPwd.equals(expectedPwd2))){
			bln = true;
		}else{
			bln = false;
		}

		return bln;
	}
}