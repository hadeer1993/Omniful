package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcoomerceListPage extends PageBases {

	public EcoomerceListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div/div[1]/div/div/div/div/div/div[2]")
	WebElement Magento;
	
	public void SetupMagento() {
		Magento.click();
	}

}
