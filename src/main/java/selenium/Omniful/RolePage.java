package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolePage extends PageBases {

	public RolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[contains(@class,'add-new-btn btn')]")
	WebElement AddBtn;
	
	@FindBy(xpath = "//span[@title='delete']")
	WebElement DeleteBtn;
	
	@FindBy(xpath = "//span[@title='Edit']")
	WebElement EditBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]")
	WebElement DeleteCnfmsg;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div")
	WebElement CreateCnfmsg;
	
	public void AddRole() {
		AddBtn.click();
	}	
	public void DeleteRole1() {
		DeleteBtn.click();
	}
		
	public void EditRole() {
		EditBtn.click();
	}
	
	public String GetDeleteConfirmationMsg() {
  
		return DeleteCnfmsg.getText();
	}
	
	public String GetCreateCnfMsg() {
		return CreateCnfmsg.getText();
	}
}
