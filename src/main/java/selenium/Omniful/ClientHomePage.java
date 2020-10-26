package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientHomePage extends PageBases {

	public ClientHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[3]/a")
	WebElement Roles;
	
	@FindBy(xpath="//*[@id=\"navbar-mobile\"]/ul/li[2]/a")
	WebElement AdminMenu;
	
	@FindBy(xpath="//*[@id=\"navbar-mobile\"]/ul/li[2]/div/a[3]")
	WebElement ChangeTimeZone;
	
	public void OpenRolesPage() {
		Roles.click();
	}
	public void OpenAdminMenu() {
		AdminMenu.click();
		ChangeTimeZone.click();
	}

}
