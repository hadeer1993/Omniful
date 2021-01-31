package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebsiteCategoriesPage extends PageBases {

	public WebsiteCategoriesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="qty")
	WebElement QTY;
	
	@FindBy(id="product-addtocart-button")
	WebElement AddToCart;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")
	WebElement ShoppingCart;
	
	public void AddToCart() {
		//QTY.click();
		AddToCart.click();
	}
	public void ShoppingCart() {
		ShoppingCart.click();
	}
}
	
