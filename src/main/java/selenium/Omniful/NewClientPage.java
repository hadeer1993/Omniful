package selenium.Omniful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewClientPage extends PageBases {
	public NewClientPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		@FindBy(id="workspaceName")
		WebElement WorkspaceName;
		
		@FindBy(id="email")
		WebElement Email;
		
		@FindBy(id="companyName")
		WebElement CompanyName;
		
		@FindBy(id="phoneNumber")
		WebElement PhoneNumber;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/div/div[2]/button")
		WebElement Savebtn;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[1]/div/div[3]/div")
		WebElement DomainValidation;	
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/div/div[1]/button")
		WebElement Cancelbtn;
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div")
		WebElement Toatsermsg; 
	
		public void CreateClientMethod(String wsn,String ee, String cn, String pn) {
			WorkspaceName.sendKeys(wsn);
			Email.sendKeys(ee);
			CompanyName.sendKeys(cn);
			PhoneNumber.sendKeys(pn);
			Savebtn.click();
		}
		public void cancelMethod() {
			Cancelbtn.click();
		}
		public String getMessage()
		{
		return DomainValidation.getText();
		}
		public void Edit(String companyname,String Phone ) {
			CompanyName.sendKeys(companyname);
			PhoneNumber.sendKeys(Phone);
			Savebtn.click();
		}

}
