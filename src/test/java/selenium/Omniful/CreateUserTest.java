package selenium.Omniful;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

@Test
public class CreateUserTest extends TestBases{
	@DataProvider(name ="dataSheet2")
	public Object[][] callExcelData() throws IOException
	{
		ExcelDataReader dataObj = new ExcelDataReader();
		return dataObj.ReadDataFromExcel(2, 4);
	}
	
	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		OpenChrome("https://osama.dashboard-omniful-stage.ibtikar.sa/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test(priority=1)
	public void Login() throws InterruptedException {
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLoginMethod("asmaa0abd.elkerim@gmail.com", "123456");
		Thread.sleep(10000);
				
	}
	@Test(priority=2)
	public void OpenUserPage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenUsersPage();
		Thread.sleep(10000);
	}
	@Test(priority=3)
	public void OpenAddUserPage() throws InterruptedException {
		UserPage Up = new UserPage(driver);
		Up.AddUser();
		Thread.sleep(20000);
	}
	@Test(priority=4,  dataProvider="dataSheet2")
	public void NewUser(String name, String email, String pn, String Validationmsg) throws InterruptedException {
	    CreateUserPage Cup = new CreateUserPage(driver);
	    Cup.CreateNewUser(name,email,pn);
	    Thread.sleep(1000);
	    
	    Cup.SelectRoleDDL();
	    ClickEnterAction();
	    Thread.sleep(1000);
	    
	    Cup.SelectHubDDL();
	    ClickEnterAction();
	    Thread.sleep(1000);
	    
	    Cup.CreateUser();
	    Thread.sleep(1000);
	    assertEquals(Cup.getMessage(), Validationmsg);
	    driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/users/create-user");
	}
}
