package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PhpMyAdminLoginPage extends PageBases {

	public PhpMyAdminLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "input_username")
	WebElement username;
	
	@FindBy(id = "input_password")
	WebElement password;
	
	@FindBy(id = "select_server")
	WebElement database;
	
	@FindBy(id = "input_go")
	WebElement go;
	
	public void LoginMethod(String email, String pass) {
		username.sendKeys(email);
		password.sendKeys(pass);
		Select dbselect = new Select(database);
		dbselect.selectByVisibleText("db_slave");
		go.click();
	}
}
