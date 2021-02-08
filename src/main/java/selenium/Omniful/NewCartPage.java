package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCartPage extends PageBases {

	public NewCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[1]/div/input")
	WebElement ActiveCheckBix;
	
	@FindBy(xpath="//*[@id=\"hub\"]/div/div[1]")
	WebElement HubDDL;
	
	@FindBy(id="react-select-84-input")
	WebElement HubTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[3]/div/div[1]/input")
	WebElement NoOfBinsTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[3]/div[2]/div[1]/input")
	WebElement NoOfBinsTxT1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[3]/div[2]/div[2]/input")
	WebElement CapacityTxT1;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[3]/div/div[2]/input")
	WebElement CapacityTxT;
	
	@FindBy(id="add-0")
	WebElement AddBinbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/button[1]")
	WebElement Savebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[2]/div/div[2]")
	WebElement Valmsg;
	
	public void SaveMethod() {
		Savebtn.click();
	}
	public String getMessage()
	{
	return Valmsg.getText();
	}
	public void AddData(String Bin, String capacity) {
		ActiveCheckBix.click();
		NoOfBinsTxT.sendKeys(Bin);
		CapacityTxT.sendKeys(capacity);
	}
	public void AddBin() {
		AddBinbtn.click();
	}
	public void AddData1(String Bin, String capacity) {
		NoOfBinsTxT1.sendKeys(Bin);
		CapacityTxT1.sendKeys(capacity);
	}
	
	public void Hub() {
		HubDDL.click();
	}
	public void SelectHub(String hub) {
		HubTxT.sendKeys(hub);
		
	}

}
