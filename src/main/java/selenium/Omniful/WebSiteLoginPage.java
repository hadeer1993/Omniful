package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSiteLoginPage extends PageBases {

	public WebSiteLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(id="send2")
	WebElement Signin;
	
	public void LoginMethod(String email, String pass) {
		Email.sendKeys(email);
		Password.sendKeys(pass);
		Signin.click();
	}
	

}
