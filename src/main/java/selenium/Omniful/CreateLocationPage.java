package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLocationPage extends PageBases{

	public CreateLocationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div/div/div[2]/div[3]/div/div/button[1]")
	WebElement CreateLocationbtn;
	
	@FindBy(xpath = "//*[@id=\"hubLocation\"]")
	WebElement Locationtxt;
	
	@FindBy(xpath = "/div/div[1]")
	WebElement Cnfmessage;

	public void CreateLocation(String name) {
		Locationtxt.sendKeys(name);
		CreateLocationbtn.click();
	}
	
	public String getMessage()
	{
	return Cnfmessage.getText();
	}
}
