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
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[1]/div/div")
	WebElement NameValidation;
	

	public void CreateNewUser(String name, String email, String pn) {
		Nametxt.sendKeys(name);
		Emailtxt.sendKeys(email);
		PhoneNum.sendKeys(pn);
		
	}
	public void SelectRoleDDL() {
		RoleDDL.click();
		
	}
	public void SelectHubDDL() {
		HubDDL.click();
		
	}
	public void CreateUser() {
		CreateBtn.click();
	}
	public String getMessage()
	{
	return NameValidation.getText();
	}
}
