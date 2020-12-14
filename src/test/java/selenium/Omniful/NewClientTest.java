package selenium.Omniful;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelDataReader;

public class NewClientTest extends TestBases {
	@DataProvider(name="data")
	public Object[][]getTestData() throws IOException, InterruptedException{
	ExcelDataReader obj=new ExcelDataReader();
	return obj.getExcelData();

	}
	
	@BeforeTest
	public void openbrowser(){
		OpenChrome("https://admin-stage-omniful.ibtikar.sa/");
	}
	@Test(priority=1)
    public void LoginAsSuperAdmin() throws InterruptedException{
	SuperAdminLoginPage subobj=new SuperAdminLoginPage(driver);
	subobj.superadminlogin("mostafa@omniful.com", "12345678");
	driver.manage().window().maximize();
	Thread.sleep(10000);
}
    @Test(priority=2)
    public void OpenSideMenu() throws InterruptedException{
		HomePage hp=new HomePage(driver);
		hp.OpenClientPage();
		Thread.sleep(10000);
	}

    @Test(priority=3)
    public void TestClient() throws InterruptedException {
	ClientPage cp=new ClientPage(driver);
	cp.CreateClient();
	Thread.sleep(10000);
}
    @Test(priority=4, dataProvider="data")
	public void SaveClient(String wsn,String ee, String cn, String pn) throws InterruptedException {
		NewClientPage ncp=new NewClientPage(driver);
		ncp.CreateClientMethod(wsn,ee,cn,pn);
		Thread.sleep(50000);
		assertEquals(ncp.getMessage(), "Client Created");
		driver.navigate().to("https://admin-stage-omniful.ibtikar.sa/clients/create-client");
	}

}
