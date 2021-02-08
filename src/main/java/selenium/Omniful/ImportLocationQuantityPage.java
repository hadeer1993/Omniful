package selenium.Omniful;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ImportLocationQuantityPage extends PageBases {
	public ImportLocationQuantityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[1]")
	WebElement ImportLocQuan;
	
	@FindBy(id="hub")
	WebElement HubDDL;
	
	@FindBy(xpath = "//*[@id=\"react-select-2-input\"]")
	WebElement SearchHub;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/div[1]/form/div[2]/div[2]/div/button")
	WebElement Uploadbtn;
	
	
	public void SelectFromHubList() {
		HubDDL.click();
	  
	}
	
	public void SendValue(String Hub) {
		SearchHub.sendKeys(Hub);
		
	}
	
	public void ClickUploadBtn() {
		Uploadbtn.click();
	 
	}
	public void UploadFile(String FilePath) {
	Uploadbtn.sendKeys(FilePath);
	}
}