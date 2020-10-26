package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends TestBases {

	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
	}
	@Test(priority=2)
	public void LoginClient() throws InterruptedException{
		 SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
			subobj.superadminlogin("mostafa@omniful.com", "12345678");
			driver.manage().window().maximize();
			Thread.sleep(10000);
	}

	
	@Test(priority=2)
	public void OpenClientPage() {
		HomePage hp=new HomePage(driver);
		hp.OpenClientPage();
		
	}
	
	}

