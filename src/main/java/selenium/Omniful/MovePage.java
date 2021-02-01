package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MovePage extends PageBases{

	public MovePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"hub\"]/div/div[2]/div")
	WebElement ClickHub;
	
	@FindBy(xpath = "//*[@id=\"react-select-3-input\"]")
	WebElement HubTxt; 
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/div")
	WebElement ClickSKU;
	
	@FindBy(xpath = "//*[@id=\"react-select-4-input\"]")
	WebElement SKUTxt;
	
	@FindBy(id = "quantity")
	WebElement Quantitytxt;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div[1]/div[1]/div/div[2]/div/div[4]/div")
	WebElement ClickSource;
	
	@FindBy(xpath = "//*[@id=\"react-select-5-input\"]")
	WebElement SourceLocationTxt;
	
	@FindBy(xpath = "//*[@id=\"destinationLocation\"]/div/div[2]/div")
	WebElement ClickDestination;
	
	@FindBy(xpath = "//*[@id=\"react-select-6-input\"]")
	WebElement DestinationLocationTxt;
	
	@FindBy(xpath = "//*[@id=\"reason\"]")
	WebElement ReasonTxt;
	
	@FindBy(xpath = "//button[contains(@class,'mt-2 mr-2')]")
	WebElement SaveBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div")
	WebElement CnfMsg;
	
	public void SelectHub() {
		ClickHub.click();
	}
	
	public void SearchHub(String Hub) {
		HubTxt.sendKeys(Hub);
	}
	
	public void SelectSKU() {
		ClickSKU.click();	
	}
	
	public void SearchSKU(String SKU) {
		SKUTxt.sendKeys(SKU);
	}
	
	public void InsertQty(String qty) {
		Quantitytxt.sendKeys(qty);
	}
	
	public void SelectSourceLocation() {
		ClickSource.click();
	}
	
	public void SearchSource(String Source) {
		SourceLocationTxt.sendKeys(Source);
	}
	
	public void SelectDestinationLocation() {
		ClickDestination.click();
		
	}
	public void SearchDestination(String destination) {
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
