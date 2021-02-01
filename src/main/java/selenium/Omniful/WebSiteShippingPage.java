package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSiteShippingPage extends PageBases {

	public WebSiteShippingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	WebElement Nextbtn;
	
	public void NextMethod() {
		Nextbtn.click();
	}

}
