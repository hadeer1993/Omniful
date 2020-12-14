package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientHomeTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://demo3.dashboard-omniful-stage.ibtikar.sa/pages/login");
	}
	@Test(priority=1)
	public void loginclient() throws InterruptedException{
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("hadeera00.1@gmail.com", "123456");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Test(priority=2)
	public void OpenRoles() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test(priority=3)
	public void OpenTimeZone() throws InterruptedException {
	ClientHomePage chp=new ClientHomePage(driver);
	chp.OpenAdminMenu();
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	}	
	
	@Test(priority=4)
	public void OpenEcommerce() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenEcomPage();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

}
