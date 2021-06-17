package selenium.Omniful;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpMyAdminDashboardPage extends PageBases{

	public PhpMyAdminDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "searchClause")
	WebElement searchBox;
	
	@FindBy(className = "last database")
	WebElement dbLink;
	
	public void SearchDB(String dbName) {
		searchBox.sendKeys(dbName);
		searchBox.sendKeys(Keys.ENTER);
		dbLink.click();
	}
}
