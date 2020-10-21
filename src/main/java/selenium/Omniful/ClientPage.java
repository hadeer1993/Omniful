package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientPage extends PageBases {

	public ClientPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"navbar-mobile\"]/div/div/ul/li/a/svg")
	WebElement SideMenu;
	
	@FindBy(className="menu-text")
	WebElement Client;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/header/div/div/button/span")
	WebElement NewClient;
	
	public void OpenClientPage(){
		//SideMenu.click();
		Client.click();
		NewClient.click();
	}
	
}
