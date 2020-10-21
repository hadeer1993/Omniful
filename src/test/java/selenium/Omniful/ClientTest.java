package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientTest extends SuperAdminLoginTest {
	@BeforeTest
	public void LoginAsClient() {
		SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
		subobj.superadminlogin("mostafa@omniful.com", "12345678");
		driver.manage().window().maximize();

	}
	
	@Test
	public void TestClient() {
		ClientPage cp=new ClientPage(driver);
		cp.OpenClientPage();
		
	}
	
}
