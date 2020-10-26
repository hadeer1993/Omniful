package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends TestBases {

	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
	}
	
	@Test
	public void OpenClientPage() {
		HomePage hp=new HomePage(driver);
		hp.OpenClientPage();
		
	}
	
	}

