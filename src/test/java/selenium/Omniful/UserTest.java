package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserTest extends TestBases{
 
	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		OpenChrome("https://osama.dashboard-omniful-stage.ibtikar.sa/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test(priority = 1)
	public void ClientLogin() throws InterruptedException {
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLoginMethod("asmaa0abd.elkerim@gmail.com", "123456");
		Thread.sleep(10000);
	}
	public void OpenUserPage() throws InterruptedException {
		ClientHomePage Chp = new ClientHomePage(driver);
		Chp.OpenUsersPage();
		Thread.sleep(10000);
	}
	public void AddUser() {
		UserPage Up = new UserPage(driver);
		Up.AddUser();
		
	}
	public void EditUser(){
		UserPage Up = new UserPage(driver);
		Up.EditUser();
	}
	public void DeleteUser() {
		UserPage Up = new UserPage(driver);
		Up.DeleteUser();
	}
}
