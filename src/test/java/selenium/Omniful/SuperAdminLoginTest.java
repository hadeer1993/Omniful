package selenium.Omniful;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;


public class SuperAdminLoginTest extends TestBases {
	
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
		
	}
	
	@Test(priority =1)
	public void testSuperAdminLogin() {
		 SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
		subobj.superadminlogin("mostafa@omniful.com", "12345678");
	}
	@Test(priority =2)
	public void TestMenu() {
	HomePage hp=new HomePage(driver);
	hp.OpenClientPage();
	}	
}
