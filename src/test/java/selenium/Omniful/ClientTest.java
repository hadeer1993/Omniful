package selenium.Omniful;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClientTest extends TestBases{
	
	@BeforeTest
	public void openbrowser(){
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
	}
	@Test(priority=1)
	     public void LoginAsSuperAdmin() throws InterruptedException{
		SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
		subobj.superadminlogin("mostafa@omniful.com", "12345678");
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
	public void TestClient() {
		ClientPage cp=new ClientPage(driver);
		cp.CreateClient();
		
	}
	
}
