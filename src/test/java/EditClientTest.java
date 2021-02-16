import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Omniful.HomePage;
import selenium.Omniful.NewClientPage;
import selenium.Omniful.SuperAdminLoginPage;
import selenium.Omniful.TestBases;

public class EditClientTest extends TestBases {
	@BeforeTest
	public void openbrowser(){
		OpenChrome("https://admin-demo-omniful.ibtikar.sa/");
	}
	@Test
    public void LoginAsSuperAdmin() throws InterruptedException{
	SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
	subobj.superadminlogin("mostafa@omniful.com", "12345678");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.navigate().to("https://admin-demo-omniful.ibtikar.sa/clients/edit-client/28");
	Thread.sleep(5000);
	NewClientPage ncp=new NewClientPage(driver);
	ncp.Edit("wsn","11");
	Thread.sleep(1000);
	
	}


}
