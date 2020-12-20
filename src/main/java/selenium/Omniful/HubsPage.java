package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HubsPage extends PageBases {

	public HubsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"add-user\"]/button")
	WebElement AddNew;
	
	public void ClickAddNew() {
		AddNew.click();
	}

}
