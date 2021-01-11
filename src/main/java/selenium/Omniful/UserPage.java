package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends PageBases{

	public UserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[1]/div/button")
	WebElement AddBtn;
	
	@FindBy(xpath = "//*[@id=\"cell-yY3Zkvhu9Y-2\"]/div/span[1]/svg")
	WebElement EditBtn;
	
	@FindBy(xpath = "//*[@id=\"cell-yY3Zkvhu9Y-2\"]/div/span[2]/svg")
	WebElement DeleteBtn;
	
	public void AddUser() {
		AddBtn.click();
	}
	public void EditUser() {
		EditBtn.click();
	}
	public void DeleteUser() {
		DeleteBtn.click();
	}
}
