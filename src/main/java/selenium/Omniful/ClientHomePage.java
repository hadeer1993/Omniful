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
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[5]/a/div[1]")
	WebElement Settings;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[5]/ul/li[1]/a/div")
	WebElement Ecommerce;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[5]/ul/li[2]/a/div")
	WebElement CatlogLang;

	public void OpenRolesPage() {
		Roles.click();
	}
	public void OpenAdminMenu() {
		AdminMenu.click();
		ChangeTimeZone.click();
	}
	
	public void OpenEcomPage() {
		Settings.click();
		Ecommerce.click();
	}
	
	public void OpenLangPage() {
		Settings.click();
		CatlogLang.click();
	}


}
