package selenium.Omniful;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.ClientHomePage;
import selenium.Omniful.ClientLoginPage;
import selenium.Omniful.SetupAramexPage;
import selenium.Omniful.ShippingPage;
import selenium.Omniful.TestBases;

public class SetupAramexTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://demo3.dashboard-omniful-stage.ibtikar.sa/pages/login");
	}
	@Test(priority=1)
	public void OpenShippingMethod() throws InterruptedException {
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
		
		SetupAramexPage SetupAr=new SetupAramexPage(driver);
		SetupAr.ClickIntegrate();
		Thread.sleep(10000);

		assertEquals(SetupAr.getMessage(),"This field is required.");
		Thread.sleep(10000);
		driver.navigate().to("https://demo3.dashboard-omniful-stage.ibtikar.sa/settings/shipping-methods/aramex-integration");
		Thread.sleep(10000);
	
		SetupAr.AramexIntegrate("reem@reem.com","123456789","v1","20016","331421","AMM","JO","24");
		Thread.sleep(10000);

		SetupAr.ClickIntegrate();
		Thread.sleep(10000);

	}
	

}
