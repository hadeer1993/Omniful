package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetupMagentoTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://ttttttttrrrrr.dashboard-omniful-stage.ibtikar.sa/");
	}
	@Test(priority=1)
    public void IntegrateMagento() throws InterruptedException{
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("had.eera.001@gmail.com", "123456");
	     driver.manage().window().maximize();
	     Thread.sleep(10000);
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenEcomPage();
		Thread.sleep(10000);
		EcoomerceListPage ecolist=new EcoomerceListPage(driver);
		ecolist.SetupMagento();
		Thread.sleep(10000);
		SetupMagentoPage smp=new SetupMagentoPage(driver);
		smp.Integrate("https://omniful.store","omniful", "ibtikar2020");
    }   

}
