package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogLangPage extends PageBases {

	public CatalogLangPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div/div/div/div[1]")
	WebElement SelectDefaultLanguage;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/div[2]/div/button[1]")
	WebElement Savebtn;
	
	public void Selectlanguagee() {
		Savebtn.click();
	}

}
