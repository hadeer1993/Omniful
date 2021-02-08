package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetupAramexPage extends PageBases {

	public SetupAramexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="username")
	WebElement UserTxT;
	
	@FindBy(id="password")
	WebElement PasswordTxT;
	
	@FindBy(id="version")
	WebElement VersionTxT;
	
	@FindBy(id="account_number")
	WebElement AccountNumberTxT;
	
	@FindBy(id="account_bin")
	WebElement AccountBinTxT;
	
	@FindBy(id="account_entity")
	WebElement AccountEntityTxT;
	
	@FindBy(id="account_country_code")
	WebElement AccountCountryCodeTxT;
	
	@FindBy(id="source")
	WebElement SourceTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/button[1]")
	WebElement Integratebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div[1]/div")
	WebElement UserValidation;
	
	public void ClickIntegrate() {
		Integratebtn.click();
	}
	
	public void AramexIntegrate(String user, String pass, String version, String accno, String accbin, String accen, String acccode, String source ) {
		UserTxT.sendKeys(user);
		PasswordTxT.sendKeys(pass);
		VersionTxT.sendKeys(version);
		AccountNumberTxT.sendKeys(accno);
		AccountBinTxT.sendKeys(accbin);
		AccountEntityTxT.sendKeys(accen);
		AccountCountryCodeTxT.sendKeys(acccode);
		SourceTxT.sendKeys(source);
	}
	
	public String getMessage()
	{
	return UserValidation.getText();
	}
	
	

}
