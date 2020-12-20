package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolePage extends PageBases {

	public RolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[1]/div/button")
	WebElement AddBtn;
	
	@FindBy(xpath = "//*[@id=\"cell-1xjgFPCpn--1\"]/div/span[2]/svg")
	WebElement DeleteBtn;
	
	
	public void AddRole() {
		AddBtn.click();
	}	
	public void DeleteRole1() {
		DeleteBtn.click();
	}
		
	
	
}
