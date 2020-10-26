package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientLoginPage extends PageBases {

	public ClientLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name = "email")
	WebElement EmailTXT;
	
	@FindBy(name = "password")
	WebElement PassTXT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div/div/div/main/div/div/div/div/div[2]/div/div/form/div[4]/button")
	WebElement btn;
	
	public void clientLoginMethod (String email, String pass) {
		EmailTXT.sendKeys(email);
		PassTXT.sendKeys(pass);
		btn.click();
	}
}

