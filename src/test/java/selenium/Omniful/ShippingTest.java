package selenium.Omniful;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.ClientHomePage;
import selenium.Omniful.ClientLoginPage;
import selenium.Omniful.ShippingPage;
import selenium.Omniful.TestBases;

public class ShippingTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://demo3.dashboard-omniful-stage.ibtikar.sa/pages/login");
	}
	@Test
	public void OpenShippingScreen() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("hadeera00.1@gmail.com", "123456");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		ClientHomePage chp = new ClientHomePage(driver);
		chp.OpenShipping();
		Thread.sleep(10000);
		
		ShippingPage ship=new ShippingPage(driver);
		ship.Aramex();
		Thread.sleep(10000);

	}
}
