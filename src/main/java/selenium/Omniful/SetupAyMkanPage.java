package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetupAyMkanPage extends PageBases {

	public SetupAyMkanPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="apiKey")
	WebElement ApiTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div")
	WebElement Validationmsg;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/button[1]")
	WebElement Integratebtn;
	
	public void AyMkanMethod(String api) {
		ApiTxT.sendKeys(api);
	}
	public void ClickIntegrate() {
		Integratebtn.click();
	}
	public String getMessage()
	{
	return Validationmsg.getText();
	}

}
