package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBases {
		protected WebDriver driver;
		public PageBases (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		

	}


