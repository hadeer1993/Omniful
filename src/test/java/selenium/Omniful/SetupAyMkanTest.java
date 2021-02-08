package selenium.Omniful;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.ClientHomePage;
import selenium.Omniful.ClientLoginPage;
import selenium.Omniful.SetupAyMkanPage;
import selenium.Omniful.ShippingPage;
import selenium.Omniful.TestBases;

public class SetupAyMkanTest extends TestBases {
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
		ship.Aymkan();
		Thread.sleep(10000);
		
		SetupAyMkanPage SetupAy=new SetupAyMkanPage(driver);
		SetupAy.ClickIntegrate();
		Thread.sleep(10000);

		assertEquals(SetupAy.getMessage(),"This field is required.");
		Thread.sleep(10000);
		driver.navigate().to("https://demo3.dashboard-omniful-stage.ibtikar.sa/settings/shipping-methods/ay-makan-integration");
		Thread.sleep(10000);
	
		SetupAy.AyMkanMethod("260c62ddb99f690ef2fb854a801620f4-5b6fcf8c-ee76-4119-8d0b-e3ecf9419b9b-af3d8b96e9f70a2a1dc535eb36d327a5/3ac63a6b72c06071db3dc031a3dc4d4a/fea6f5a4-20dd-49e8-9486-c3859431d417");
		Thread.sleep(10000);

		SetupAy.ClickIntegrate();
		Thread.sleep(10000);

	}
}
