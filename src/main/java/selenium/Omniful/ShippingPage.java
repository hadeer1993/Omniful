package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PageBases {

	public ShippingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div/div/div/div/div/div[2]/img")
	WebElement Aramexbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/img")
	WebElement Aymkanbtn;
	
	public void Aramex() {
		Aramexbtn.click();
	}
	public void Aymkan() {
		Aymkanbtn.click();
	}	
}
