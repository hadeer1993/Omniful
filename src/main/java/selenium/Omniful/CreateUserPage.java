package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPage extends PageBases {

	public CreateUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement Nametxt;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement Emailtxt;
	
	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement PhoneNum;
	
	@FindBy(xpath = "//*[@id=\"roles\"]/div[1]/div[2]/div/svg")
	WebElement RoleDDL;
	
	@FindBy(xpath = "//*[@id=\"roles\"]/div[1]/div[2]/div[2]/svg")
	WebElement SelectRole;
	
	@FindBy(xpath = "//*[@id=\"hubs\"]/div[1]/div[2]/div/svg")
	WebElement HubDDL;
	
	@FindBy(xpath = "//*[@id=\"hubs\"]/div[1]/div[2]/div[2]")
	WebElement SelectHub;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/button[1]")
	WebElement CreateBtn;
	
	@FindBy(xpath = "/div/div[1]")
	WebElement Cnfmessg;
	

	public void CreateNewUser(String name, String email, String pn) {
		Nametxt.sendKeys(name);
		Emailtxt.sendKeys(email);
		PhoneNum.sendKeys(pn);
		RoleDDL.click();
		SelectRole.click();
		HubDDL.click();
		SelectHub.click();
		CreateBtn.click();
	}
	public String getMessage()
	{
	return Cnfmessg.getText();
	}
}
