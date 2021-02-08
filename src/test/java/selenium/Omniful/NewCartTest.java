package selenium.Omniful;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewCartTest extends TestBases {
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
		driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/picking/carts");
		Thread.sleep(10000);
		CartPage cart=new CartPage(driver);
		cart.AddCart();
		
		NewCartPage addcart=new NewCartPage(driver);
		addcart.SaveMethod();
		Thread.sleep(10000);
		assertEquals(addcart.getMessage(),"This field is required!");
		Thread.sleep(10000);
		driver.navigate().to("https://osama.dashboard-omniful-stage.ibtikar.sa/picking/carts/create");
		Thread.sleep(5000);
		
		addcart.Hub();
	    Thread.sleep(1000);
		//addcart.SelectHub("miami");
		ClickEnterAction();
	    Thread.sleep(1000);
	    
	    addcart.AddData("6", "4");
	    Thread.sleep(1000);
	    
	    addcart.AddBin();
	    Thread.sleep(1000);

	    addcart.AddData1("6", "4");
	    Thread.sleep(1000);

	    addcart.SaveMethod();
		Thread.sleep(5000);
	

	}
}
