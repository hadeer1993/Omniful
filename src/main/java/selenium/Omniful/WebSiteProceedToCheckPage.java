package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSiteProceedToCheckPage extends PageBases {

	public WebSiteProceedToCheckPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")
	WebElement ProceedToCheckbtn;
	
	public void ClickProceed() {
		ProceedToCheckbtn.click();

	}
}
