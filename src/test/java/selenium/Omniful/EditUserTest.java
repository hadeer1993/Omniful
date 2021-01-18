package selenium.Omniful;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

public class EditUserTest extends TestBases {

	@DataProvider(name ="dataSheet4")
	public Object[][] callExcelData() throws IOException
	{
		ExcelDataReader dataObj = new ExcelDataReader();
		return dataObj.ReadDataFromExcel(4, 3);
	}
	
	@BeforeTest
	public void openbrowser() throws InterruptedException{
		OpenChrome("https://asmak.dashboard-omniful-stage.ibtikar.sa/");
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
	public void ClickEditbtn() throws InterruptedException {
		UserPage up = new UserPage(driver);
		up.EditUser();
		Thread.sleep(10000);
	}
	
	@Test(priority = 4)
	public void EditUser(String name, String email, String phone) throws InterruptedException {
		EditUserpage eup = new EditUserpage(driver);
		eup.EditUserPage(name, email, phone);
		Thread.sleep(10000);
		driver.navigate().to("https://asmak.dashboard-omniful-stage.ibtikar.sa/users/edit-user/34");
	}
}