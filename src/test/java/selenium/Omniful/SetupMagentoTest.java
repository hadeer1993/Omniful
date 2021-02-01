package selenium.Omniful;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import TestData.ExcelDataReader;
public class SetupMagentoTest extends TestBases {
	@DataProvider(name ="dataSheet1")
	public Object[][] callExcelData() throws IOException
	{
		ExcelDataReader dataObj = new ExcelDataReader();
		return dataObj.ReadDataFromExcel(1,3);
	}
	@BeforeTest
	public void openbrowser() {
		OpenChrome("https://asmak.dashboard-omniful-stage.ibtikar.sa/");
	}
	@Test(priority=1)
    public void LoginAsClientt() throws InterruptedException{
		ClientLoginPage clp=new ClientLoginPage(driver);
		clp.clientLoginMethod ("asmaa0abdelkerim@gmail.com", "123456");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
}
    @Test(priority=2)
    public void OpenSideMenu() throws InterruptedException{
    	ClientHomePage chp=new ClientHomePage(driver);
		chp.OpenEcomPage();
		Thread.sleep(10000);
		EcoomerceListPage eco=new EcoomerceListPage(driver);
		eco.SetupMagento();
}
    @Test(priority=3, dataProvider="dataSheet1")
	public void Integrate(String shop,String user, String pass) throws InterruptedException {
		SetupMagentoPage sm=new SetupMagentoPage(driver);
		sm.MagentoMethod(shop,user,pass);
		Thread.sleep(50000);
		driver.navigate().to("https://autypmationnnn.dashboard-omniful-stage.ibtikar.sa/settings/ecommerce-channels/channel-integration/1?channel=magento");
	}
}
