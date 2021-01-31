package selenium.Omniful;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

public class EditUserTest extends TestBases {

	@DataProvider(name ="dataSheet4")
	public Object[][] callExcelData() throws IOException
	{
		ExcelDataReader dataObj = new ExcelDataReader();
		return dataObj.ReadDataFromExcel(4, 4);
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
		clp.clientLoginMethod("asmaa0abdelkerim@gmail.com", "123456");
		Thread.sleep(10000);
}

	@Test(priority = 2)
	public void OpenUserPage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenUsersPage();
		Thread.sleep(10000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000); 
		WebElement problematicElement= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/div/div[1]"));
		js.executeScript("arguments[0].scrollIntoView()", problematicElement);
	}
	
	@Test(priority = 3)
	public void ClickEditbtn() throws InterruptedException {
		UserPage up = new UserPage(driver);
		up.EditUser();
		Thread.sleep(10000);
	}
	
	@Test(priority = 4)
	public void EditUser(String name, String email, String phone, String Validationmsg) throws InterruptedException {
		EditUserpage eup = new EditUserpage(driver);
		eup.EditUserPage(name, email, phone);
		Thread.sleep(10000);
		
		//assertEquals(eup.getmsg(), Validationmsg);
		driver.navigate().to("https://asmak.dashboard-omniful-stage.ibtikar.sa/users/edit-user/34");
	}
}