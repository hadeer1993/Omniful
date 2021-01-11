package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateRoleTest extends TestBases {

	@BeforeTest
	public void Openbrowser() throws InterruptedException {
		OpenChrome("https://demo3.dashboard-omniful-stage.ibtikar.sa/pages/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test(priority=1)
	public void LoginCLient() throws InterruptedException {
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLoginMethod("hadeera00.1@gmail.com", "123456");
		Thread.sleep(10000);
	}
	@Test(priority = 2)
	public void OpenRoles() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenRolesPage();
		Thread.sleep(10000);
	}
	@Test(priority=3)
	public void OpenAddRole() throws InterruptedException {
		RolePage rp = new RolePage(driver);
		rp.AddRole();
		Thread.sleep(10000);
	}
	@Test(priority = 4)
	public void AddRole() throws InterruptedException {
		CreateRolePage crp = new CreateRolePage(driver);
		crp.AddRoleMethod("role1234");
		Thread.sleep(10000);
	}

}
