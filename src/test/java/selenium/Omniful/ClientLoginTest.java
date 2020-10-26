package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientLoginTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://demo3.dashboard-omniful-stage.ibtikar.sa/pages/login");	
	}
	@Test (priority=1)
	public void ClientLogin() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("hadeera00.1@gmail.com", "123456");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test (priority=2)
	public void SideMenu() {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();
	}
	
	@Test (priority=2)
	public void ChangTime() {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenAdminMenu();
	}
	
}