package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DispatchingStationPage extends PageBases {

	public DispatchingStationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/a/button")
	WebElement AddNewbtn;
	
	public void AddNewStation() {
		AddNewbtn.click();
	}

}
