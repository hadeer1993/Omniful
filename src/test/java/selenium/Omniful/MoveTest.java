package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoveTest extends TestBases{

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
		chp.OpenMovePage();
		Thread.sleep(20000);
	
	}
	
	@Test(priority = 3)
	public void MoveItem() throws InterruptedException {
		MovePage mp = new MovePage(driver);
		mp.SelectHub("Demo");
		ClickEnterAction();
		
		mp.SelectSKU("24-MB05");
		Thread.sleep(1000);
		ClickEnterAction();
		mp.InsertQty("5");
		mp.SelectSourceLocation("P-1");
		ClickEnterAction();
		mp.SelectDestinationLocation("B-1");
		ClickEnterAction();
		mp.InsertReason("Test");
		mp.ClickSaveBtn();
		mp.getMessage();
	}
}
