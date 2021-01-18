package selenium.Omniful;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

public class CreateLocationTest extends TestBases{
	@DataProvider(name ="dataSheet3")
	public Object[][] callExcelData() throws IOException
	{
		ExcelDataReader dataObj = new ExcelDataReader();
		return dataObj.ReadDataFromExcel(3, 1);
	}
	
	@BeforeTest
	public void openbrowser() throws InterruptedException{
		OpenChrome("https://asmak.dashboard-omniful-stage.ibtikar.sa/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException {
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLoginMethod("asmaa0abdelkerim@gmail.com", "123456");
		Thread.sleep(20000);
    }
	
	@Test(priority = 2)
	public void Openhubpage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenHubsPage();
		Thread.sleep(10000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 3)
	public void OpenLocationPage() throws InterruptedException {
		HubsPage hp = new HubsPage(driver);
		hp.ClickLocation();
		Thread.sleep(10000);
		
	}
	
	@Test(priority = 4)
	public void CreateLocation(String name) throws InterruptedException {
		CreateLocationPage clp = new CreateLocationPage(driver);
		clp.CreateLocation(name);
		Thread.sleep(50000);
		driver.navigate().to("https://asmak.dashboard-omniful-stage.ibtikar.sa/hubs/locations/13/Demo");
	}
}
