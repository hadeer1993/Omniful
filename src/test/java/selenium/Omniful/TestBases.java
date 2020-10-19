package selenium.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBases {
		protected WebDriver driver;
		public void OpenChrome(String url){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to(url);
		}
		//public void WebDriverWait(WebDriver driver, int i) {
			//WebDriverWait(driver, 5);	
		//}	
	}


