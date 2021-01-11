package selenium.Omniful;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.ClientHomePage;
import selenium.Omniful.ClientLoginPage;
import selenium.Omniful.RolePage;

public class RoleTest extends TestBases{

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
	public void OpenTimeZone() throws InterruptedException {
	ClientHomePage chp=new ClientHomePage(driver);
	chp.OpenAdminMenu();
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	}	
	
	@Test(priority=3)
	public void OpenRoles() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Test(priority = 4)
	public void AddRole() throws InterruptedException {
		RolePage RP = new RolePage(driver);
		RP.AddRole();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test(priority = 5)
	public void EditRole() throws InterruptedException {
		RolePage RP = new RolePage(driver);
	    RP.EditRole();
	    driver.manage().window().maximize();
		Thread.sleep(10000);
    }
	
	@Test(priority = 6)
	public void DeleteRole() throws InterruptedException {
		RolePage RP = new RolePage(driver);
		RP.DeleteRole1();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
}
