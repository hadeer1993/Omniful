package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBases {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
		@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div[2]/ul/li[2]/a/div")
		WebElement SideMenu;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[2]")
		WebElement Clients;
		
		public void OpenClientPage(){
			//SideMenu.click();
			Clients.click();
	}

}
