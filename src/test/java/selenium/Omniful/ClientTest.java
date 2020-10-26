package selenium.Omniful;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientTest extends SuperAdminLoginTest{
	
	@BeforeTest
	public void LoginAsSuperAdmin() throws InterruptedException {
		 SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
			subobj.superadminlogin("mostafa@omniful.com", "12345678");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			assertEquals(subobj.getMessage(), "You're Home.");
	}
	@BeforeTest
	public void OpenSide() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.OpenClientPage();
		Thread.sleep(10000);
	}
	@Test
	public void TestClient() {
		ClientPage cp=new ClientPage(driver);
		cp.CreateClient();
		
	}
	
}
