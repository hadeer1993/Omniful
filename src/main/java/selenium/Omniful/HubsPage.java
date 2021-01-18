package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HubsPage extends PageBases {

	public HubsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"add-user\"]/a/button")
	WebElement AddNew;
	
	public void ClickAddNew() {
		AddNew.click();
	}

	@FindBy(xpath = "//*[@id=\"card-13\"]/div/div/div[5]/div/li/a/span/svg")
	WebElement GearBtn;
	
	public void ClickGearButton() {
		GearBtn.click();
	}
	@FindBy(xpath = "//*[@id=\"card-13\"]/div/div/div[5]/div/li/a/span/svg/path")
	WebElement LocationBtn;
	
	public void ClickLocation() {
		LocationBtn.click();
	}
}
