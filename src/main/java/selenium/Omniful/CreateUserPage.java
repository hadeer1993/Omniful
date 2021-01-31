package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPage extends PageBases {

	public CreateUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "name")
	WebElement Nametxt;
	
	@FindBy(id = "email")
	WebElement Emailtxt;
	
	@FindBy(id = "phone")
	WebElement PhoneNum;
	
	@FindBy(id = "roles")
	WebElement RoleDDL;
	
	@FindBy(xpath = "//div[@class=' css-1hwfws3']")
	WebElement RoleTxt;
	
	@FindBy(id = "hubs")
	WebElement HubDDL;
	
	@FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
	WebElement HubTxt;
	
	@FindBy(xpath = "//button[contains(@class,'mt-2 mr-1')]")
	WebElement CreateBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div")
	WebElement Cnfmessg;
	

	public void CreateNewUser(String name, String email, String pn) {
		Nametxt.sendKeys(name);
		Emailtxt.sendKeys(email);
		PhoneNum.sendKeys(pn);
		
	}
	public void SelectRoleDDL() {
		RoleDDL.click();
		//RoleTxt.sendKeys(role);
	}
	public void SelectHubDDL() {
		HubDDL.click();
		//HubTxt.sendKeys(demo);
	}
	public void CreateUser() {
		CreateBtn.click();
	}
	public String getMessage()
	{
	return Cnfmessg.getText();
	}
}
