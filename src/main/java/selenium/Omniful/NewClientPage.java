package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewClientPage extends PageBases {
	public NewClientPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		@FindBy(name="workspaceName")
		WebElement WorkspaceName;
		
		@FindBy(name="email")
		WebElement Email;
		
		@FindBy(name="companyName")
		WebElement CompanyName;
		
		@FindBy(name="phoneNumber")
		WebElement PhoneNumber;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/div/div[2]/button")
		WebElement Savebtn;
		
		public void CreateClientMethod(String wsn,String ee, String cn, String pn) {
			WorkspaceName.sendKeys(wsn);
			Email.sendKeys(ee);
			CompanyName.sendKeys(cn);
			PhoneNumber.sendKeys(pn);
			Savebtn.click();
		}
		

}
