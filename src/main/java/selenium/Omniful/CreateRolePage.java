package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateRolePage extends PageBases {

	public CreateRolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div[1]/div[2]/div/input\r\n")
	WebElement RoleTXT;
	
	@FindBy(xpath = "//div[contains(@class,'lead collapse-title')]")
	WebElement RoleDDL;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div[3]/div/div[2]/div/div/div[1]")
	WebElement RoleCB;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/button[1]")
	WebElement Createbtn;
	
	
	public void AddRoleMethod(String rn)  {
		RoleTXT.sendKeys(rn);
		RoleDDL.click();
		RoleCB.click();
		Createbtn.click();
	}
	
}
