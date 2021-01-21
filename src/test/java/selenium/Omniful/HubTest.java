package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HubTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://osama.dashboard-omniful-stage.ibtikar.sa/");
	}
	@Test(priority=1)
	public void HubMethod() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("asmaa0abd.elkerim@gmail.com", "123456");
	     driver.manage().window().maximize();
	     Thread.sleep(10000);
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenHubsPage();
		Thread.sleep(10000);
		HubsPage hub=new HubsPage(driver);
		hub.ClickAddNew();
	}
	@Test(priority=2)
	public void LocationMethod() throws InterruptedException {
	HubsPage hub=new HubsPage(driver);
	hub.ClickLocation();
	}

}
