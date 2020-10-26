package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientHomeTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://demo3.dashboard-omniful-stage.ibtikar.sa/pages/login");
	}
	
	@Test(priority=1)
	public void OpenRoles() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();	
	}
	@Test(priority=2)
	public void OpenTimeZone() {
	ClientHomePage chp=new ClientHomePage(driver);
	chp.OpenAdminMenu();	
	
	}	
}
