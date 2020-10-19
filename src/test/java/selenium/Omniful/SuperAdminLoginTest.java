package selenium.Omniful;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;


public class SuperAdminLoginTest extends TestBases {
	
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
		
	}
	
	@Test
	public void testSuperAdminLogin() {
		 SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
		subobj.superadminlogin("mostafa@omniful.com", "12345678");
		assertEquals(subobj.getMessage(), "You're Home.");
	}
		
}
