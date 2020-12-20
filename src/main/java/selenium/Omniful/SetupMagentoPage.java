package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetupMagentoPage extends PageBases {

	public SetupMagentoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="shopUrl")
	WebElement ShopURL;
	
	@FindBy(id="userName")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement PassWord;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/button[1]")
	WebElement Intbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div")
	WebElement Cnfmessg;
	
	public void Integrate(String shop,String user, String pass) {
		ShopURL.sendKeys(shop);
		UserName.sendKeys(user);
		PassWord.sendKeys(pass);
		Intbtn.click();
	}
	public String getMessage()
	{
	return Cnfmessg.getText();
	}
}
