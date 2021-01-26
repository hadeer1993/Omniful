package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MovePage extends PageBases{

	public MovePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"hub\"]/div/div[1]/div[1]")
	WebElement HubTxt; 
	
	@FindBy(xpath = "//*[@id=\"sku\"]/div/div[1]")
	WebElement SKUTxt;
	
	@FindBy(id = "quantity")
	WebElement Quantitytxt;
	
	@FindBy(xpath = "//*[@id=\"location\"]/div/div[1]")
	WebElement SourceLocationTxt;
	
	
	@FindBy(xpath = "//*[@id=\"destinationLocation\"]/div/div[1]")
	WebElement DestinationLocationTxt;
	
	@FindBy(xpath = "//*[@id=\"reason\"]")
	WebElement ReasonTxt;
	
	@FindBy(xpath = "//button[contains(@class,'mt-2 mr-2')]")
	WebElement SaveBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div")
	WebElement CnfMsg;
	
	public void SelectHub(String HubName) {
		HubTxt.click();
		HubTxt.sendKeys(HubName);
	}
	
	public void SelectSKU(String SKU) {
		SKUTxt.click();
		SKUTxt.sendKeys(SKU);
	}
	
	public void InsertQty(String qty) {
		Quantitytxt.sendKeys(qty);
	}
	
	public void SelectSourceLocation(String Source) {
		SourceLocationTxt.click();
		SourceLocationTxt.sendKeys(Source);
	}
	
	public void SelectDestinationLocation(String destination) {
		DestinationLocationTxt.click();
		DestinationLocationTxt.sendKeys(destination);
	}
	
	public void InsertReason(String reason) {
		ReasonTxt.sendKeys(reason);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	
	public String getMessage()
	{
	return CnfMsg.getText();
}
}
