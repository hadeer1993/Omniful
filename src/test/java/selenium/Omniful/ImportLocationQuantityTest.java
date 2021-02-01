package selenium.Omniful;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImportLocationQuantityTest extends TestBases {
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://osama.dashboard-omniful-stage.ibtikar.sa/");
	}
	@Test(priority=1)
	public void Login() throws InterruptedException {
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("asmaa0abd.elkerim@gmail.com", "123456");
	     driver.manage().window().maximize();
	     Thread.sleep(10000);
	     driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/inventory/importing");
	     Thread.sleep(10000);
	}
	     @Test(priority=2)   
	    public void ImportMethod() throws InterruptedException {
	   ImportLocationQuantityPage imp=new ImportLocationQuantityPage(driver);
	     imp.SelectFromHubList();
	      Thread.sleep(5000);
		
		ClickEnterAction();
	    Thread.sleep(5000);
	     
	     imp.UploadFile();
		Thread.sleep(1000);
	     
}
}