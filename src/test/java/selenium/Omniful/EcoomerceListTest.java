package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcoomerceListTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://ttttttttrrrrr.dashboard-omniful-stage.ibtikar.sa/");
	}
	@Test(priority=1)
    public void LoginAsClientt() throws InterruptedException{
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("had.eera.001@gmail.com", "123456");
	driver.manage().window().maximize();
	Thread.sleep(10000);
}
    @Test(priority=2)
    public void OpenSideMenu() throws InterruptedException{
		HomePage hp=new HomePage(driver);
		hp.OpenClientPage();
		Thread.sleep(10000);
}
    @Test(priority=3)
	public void OpenEco() throws InterruptedException {
		ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenEcomPage();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		EcoomerceListPage ecolist=new EcoomerceListPage(driver);
		ecolist.SetupMagento();
    }   
}