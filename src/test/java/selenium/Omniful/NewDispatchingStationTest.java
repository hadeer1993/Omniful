package selenium.Omniful;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.ClientLoginPage;
import selenium.Omniful.TestBases;

public class NewDispatchingStationTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://osama.dashboard-omniful-stage.ibtikar.sa/");
	}
	@Test(priority=1)
	public void OpenShippingMethod() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("asmaa0abd.elkerim@gmail.com", "123456");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/picking/dispatching-list");
		Thread.sleep(10000);
		DispatchingStationPage stationbtn=new DispatchingStationPage(driver);
		stationbtn.AddNewStation();
		Thread.sleep(10000);
		
		NewDispatchingStationPage station=new NewDispatchingStationPage(driver);
		station.SaveMethod();
		Thread.sleep(10000);
		assertEquals(station.getMessage(),"This field is required!");
		Thread.sleep(10000);
		driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/picking/dispatching-list/create");
		Thread.sleep(10000);
		
		station.Hub();
	    Thread.sleep(1000);
		station.SelectHub("miami");
		ClickEnterAction();
	    Thread.sleep(1000);
		
		station.AddData("Automation");
	    Thread.sleep(1000);
		station.SaveMethod();

	}
}
