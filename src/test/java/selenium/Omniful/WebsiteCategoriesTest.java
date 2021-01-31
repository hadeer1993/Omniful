package selenium.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebsiteCategoriesTest extends TestBases {
	@BeforeTest
	public void openbrowser() throws InterruptedException {
		OpenChrome("https://omniful.store/customer/account/login/referer/aHR0cHM6Ly9vbW5pZnVsLnN0b3JlL2pvdXN0LWR1ZmZsZS1iYWcuaHRtbA%2C%2C/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@Test
	public void ShopingMethod() throws InterruptedException {
		WebSiteLoginPage weblog=new WebSiteLoginPage(driver);
		weblog.LoginMethod("hadeera001@gmail.com", "1461993@ha");
		Thread.sleep(5000);
		driver.navigate().to("https://omniful.store/joust-duffle-bag.html");
		WebsiteCategoriesPage web=new WebsiteCategoriesPage(driver);
		web.AddToCart();
		Thread.sleep(5000);
		web.ShoppingCart();
	}

}
