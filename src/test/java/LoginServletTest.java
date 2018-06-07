import org.junit.Test;
import static junit.framework.Assert.*;
import junit.framework.TestCase;

public class LoginServletTest extends TestCase{

	LoginServlet login = new LoginServlet();

	public LoginServletTest(String name) {
		super(name);
	}
	
    @Test
    public void testUserCheck(){

        boolean booln = login.userCheck("devops2018","devops@2018");

		if(booln)
			System.out.println("Login Success");
		else System.out.println("Login Failed");

        assertEquals(true, booln);

    }
}