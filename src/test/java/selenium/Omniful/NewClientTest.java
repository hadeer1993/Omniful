package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClientTest extends ClientTest {
	@BeforeTest
	public void AddClient() {
		ClientPage cp=new ClientPage(driver);
		cp.CreateClient();
	}
	@Test
	public void SaveClient() {
		NewClientPage ncp=new NewClientPage(driver);
		ncp.CreateClientMethod("automation","test@testtt.com","auto","1111111");
	}

	
	
	

}
