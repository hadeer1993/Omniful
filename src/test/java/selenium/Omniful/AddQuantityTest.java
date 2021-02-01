package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddQuantityTest extends TestBases {

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
	public void OpenMovePage() throws InterruptedException {
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenAddQuantityPage();
		Thread.sleep(10000);
	}
	
	@Test(priority = 3)
	public void AddQuantity() throws InterruptedException {
		AddQuantityPage aqp = new AddQuantityPage(driver);
		aqp.SelectHub();
		Thread.sleep(1000);
		aqp.SearchHub("Salams");
		Thread.sleep(1000);
		ClickEnterAction();
		
		aqp.SelectLocation();
		Thread.sleep(1000);
		aqp.SearchLocation("picking");
		Thread.sleep(1000);
		ClickEnterAction();
		
		aqp.SelectSKU();
		Thread.sleep(1000);
		aqp.SearchSKU("WJ08-M-Orange");
		Thread.sleep(5000);
		ClickEnterAction();
		
		aqp.InsertQty("100");
		aqp.InsertReason("automation");
		Thread.sleep(1000);
		aqp.ClickSaveBtn();
	}
}
