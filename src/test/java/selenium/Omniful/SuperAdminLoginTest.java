package selenium.Omniful;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;


public class SuperAdminLoginTest extends TestBases {
	
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
		
	}
	@Test
	public void testSuperAdminLogin() throws InterruptedException {
		 SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
		subobj.superadminlogin("mostafa@omniful.com", "12345678");
	}
}
