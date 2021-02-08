package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewDispatchingStationPage extends PageBases {

	public NewDispatchingStationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[1]/div/input")
	WebElement Activebtn;
	
	@FindBy(id="hub")
	WebElement HubDDL;
	
	@FindBy(xpath="//*[@id=\"react-select-2-input\"]") 
	WebElement HubTxT;
	
	@FindBy(id="name")
	WebElement StationNameTxT;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/div/button[1]")
	WebElement Savebtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[1]/div[3]/div/div")
	WebElement Valmsg;
	
	public String getMessage()
	{
	return Valmsg.getText();
	}
	public void AddData(String name) {
		Activebtn.click();
		StationNameTxT.sendKeys(name);
	}
	public void Hub() {
		HubDDL.click();
	}
	public void SelectHub(String hub) {
		HubTxT.sendKeys(hub);
		
	}
	public void SaveMethod() {
		Savebtn.click();
	}


}
