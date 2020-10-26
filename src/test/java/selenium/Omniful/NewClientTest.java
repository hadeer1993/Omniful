package selenium.Omniful;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClientTest extends ClientTest {
	@BeforeTest
	public void AddClient() throws InterruptedException {
		ClientPage cp=new ClientPage(driver);
		cp.CreateClient();
		Thread.sleep(10000);

	}
	@Test
	public void SaveClient() {
		NewClientPage ncp=new NewClientPage(driver);
		ncp.CreateClientMethod("automation","test@testtt.com","auto","1111111");
		assertEquals(ncp.getMessage(), "Client Created");
	}

	
	
	

}
