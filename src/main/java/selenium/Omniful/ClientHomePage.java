package selenium.Omniful;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[2]/a/div")
	WebElement Users;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[6]/a/div")
	WebElement Hubs;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[7]/a/div[1]")
	WebElement Inventory;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[2]")
	WebElement Scroll;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]")
	WebElement SideMenu;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[7]/ul/li[8]/a/div")
	WebElement Importing;

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

	public void OpenUsersPage() {
		Users.click();
	}

	public void OpenHubsPage() {
		Hubs.click();
	}
	
	public void OpenImporting() throws InterruptedException {
		Inventory.click();
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[2]/div"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		Importing.click();
	}
}
