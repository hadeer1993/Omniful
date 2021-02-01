package selenium.Omniful;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends PageBases{

	public UserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 
	@FindBy(xpath = "//button[contains(@class,'add-new-btn btn')]")
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
	public void Scrollbar() {
		WebElement problematicElement= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/div/div[1]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView()", problematicElement);
	}
}
