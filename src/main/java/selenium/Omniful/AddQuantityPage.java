package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddQuantityPage extends PageBases {

	public AddQuantityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"hub_id\"]/div/div[2]/div")
	WebElement ClickHub;
	
	@FindBy(xpath = "//*[@id=\"react-select-3-input\"]")
	WebElement HubTxt;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div/div[1]/div[2]/div[1]/div[2]/div")
	WebElement ClickLocation;
	
	@FindBy(xpath = "//*[@id=\"react-select-4-input\"]")
	WebElement LocationTxt;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div/div[1]/div[2]/div[1]/div[3]/div")
	WebElement ClickSKU;
	
	@FindBy(xpath = "//*[@id=\"react-select-5-input\"]")
	WebElement SKUTxt;
	
	@FindBy(name = "quantity")
	WebElement QtyTxt;
	
	@FindBy(name = "reason")
	WebElement ReasonTxt;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/form/div/div[1]/div[2]/div[2]/div/div/button[1]")
	WebElement SaveBtn;


    public void SelectHub() {
	  ClickHub.click();
	  }
    
    public void SearchHub(String Hub) {
    	HubTxt.sendKeys(Hub);
    }
    public void SelectLocation() {
    	ClickLocation.click();
    	
    }
    public void SearchLocation(String Loc) {
    	LocationTxt.sendKeys(Loc);    }
    
    public void SelectSKU() {
    	ClickSKU.click();
    	
    }
    public void SearchSKU(String SKU) {
    	SKUTxt.sendKeys(SKU);
    }
    
    public void InsertQty(String qty) {
    	QtyTxt.sendKeys(qty);
    }
    
    public void InsertReason(String reason) {
    	ReasonTxt.sendKeys(reason);
    }
    
    public void ClickSaveBtn() {
    	SaveBtn.click();
    }
}