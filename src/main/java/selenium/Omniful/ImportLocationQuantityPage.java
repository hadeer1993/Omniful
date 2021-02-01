package selenium.Omniful;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;


public class ImportLocationQuantityPage extends PageBases {

	public ImportLocationQuantityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[1]")
	WebElement ImportLocQuan;
	
	@FindBy(id="hub")
	WebElement HubDDL;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[1]/form/div[1]/div[2]/div/button")
	WebElement Uploadbtn;

	
	
	public void SelectFromHubList() {
		HubDDL.click();
	   
	}
	
	public void SendValue(String miami) {
		HubDDL.sendKeys(miami);
		
	}
	
	public void UploadFile() {
		Uploadbtn.click();
		Uploadbtn.sendKeys("C:\\Users\\klkll\\Downloads\\Audit Example Import File (1) (1).xlsx");
	}

}


