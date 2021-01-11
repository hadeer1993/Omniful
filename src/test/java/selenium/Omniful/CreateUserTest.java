package selenium.Omniful;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

public class CreateUserTest extends TestBases{
	@DataProvider(name="datasheet2")
	public Object[][] callExcelData() throws IOException{
		
		ExcelDataReader dataobj = new ExcelDataReader();
		return dataobj.ReadDataFromExcel(2, 3);
	}

	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		OpenChrome("https://osama.dashboard-omniful-stage.ibtikar.sa/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test(priority = 1)
	public void Login() throws InterruptedException {
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLoginMethod("asmaa0abd.elkerim@gmail.com", "123456");
		Thread.sleep(10000);
				
	}
	@Test(priority = 2)
	public void OpenUserPage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenUsersPage();
		Thread.sleep(10000);
	}
	@Test(priority = 3)
	public void OpenAddUserPage() throws InterruptedException {
		UserPage Up = new UserPage(driver);
		Up.AddUser();
		Thread.sleep(10000);
	}
	@Test(priority = 4)
	public void AddNewUser(String name, String email, String pn) throws InterruptedException {
	    CreateUserPage Cup = new CreateUserPage(driver);
	    Cup.CreateNewUser(name, email, pn);
	    Thread.sleep(10000);
	}
}
