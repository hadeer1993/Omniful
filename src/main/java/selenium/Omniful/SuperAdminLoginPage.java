package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuperAdminLoginPage extends PageBases {

	public SuperAdminLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/div/div/div/main/div/div/div/div/div[2]/div/div/form/div[3]/div/button")
	WebElement btn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/h4")
	WebElement message;
	
	public void superadminlogin(String email,String password)
	{
		Email.sendKeys(email);
		Password.sendKeys(password);
		btn.click();
	}
	public String getMessage()
	{
	return message.getText();
	}

}
