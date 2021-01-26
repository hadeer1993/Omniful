package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLocationPage extends PageBases{

	public CreateLocationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "hubLocation")
	WebElement Locationtxt;
	
	@FindBy(xpath = "//input[@name='locationType']")
	WebElement LocationType;
	
	@FindBy(xpath = "//button[contains(@class,'mr-2 btn')]")
	WebElement CreateLocationbtn;
	
	@FindBy(xpath = "/div/div[1]")
	WebElement Cnfmessage;

	public void CreateLocation(String name) {
		Locationtxt.sendKeys(name);
		LocationType.click();
		CreateLocationbtn.click();
	}
	
	public String getMessage()
	{
	return Cnfmessage.getText();
	}
}
