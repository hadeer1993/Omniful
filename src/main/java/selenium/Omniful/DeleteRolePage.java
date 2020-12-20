package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteRolePage extends PageBases{

	public DeleteRolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[1]/div/div/p/button[1]")
	WebElement Yesbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[1]/div/div/p/button[2]")
	WebElement Nobtn;
	
	public void YesDeleteRoleMethod() {
		Yesbtn.click();
	}
	public void NoDeleteRoleMethod() {
		Nobtn.click();
	}
}
