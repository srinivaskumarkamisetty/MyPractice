package com.nopcommerce.Testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopcommerce.pages.DashBoardPage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.utils.Browser;
import com.nopcommerce.utils.ReadData;
import com.nopcommerce.utils.RetryAnalyzer;

public class DashbordPageTest1 {
	private WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	public void setup() throws Exception {
		java.util.List<String> browserdata=ReadData.Getdata("browser",1);
		String browsername=browserdata.get(0);
		String drivername=browserdata.get(1);
		String driverpath=browserdata.get(2);
		String Url=browserdata.get(3);
		driver=Browser.launchBrowser(browsername, drivername, driverpath);
		Browser.openUrl(Url);
		
	}
	@AfterClass
	public void teardown() {
		Browser.CloseBrowser();
		
	}
	@Test(groups="smoke",retryAnalyzer=RetryAnalyzer.class,priority=1,enabled=true,description="Here login button functionality with valid data")
	public void verifyLoginBtnFunctionalityByUsingValidData() throws Exception {
		List<String> loginData=ReadData.Getdata("loginpage",1);
		String email=loginData.get(0);
		String password=loginData.get(1);
		LoginPage login=new LoginPage(driver);
		login.nopcommerceLogin(email, password);
		DashBoardPage obj=new DashBoardPage(driver);
		Assert.assertTrue(obj.isDashboardLabelVisible()," Script failed DashBoard not visible");
	}
	@Test(groups="smoke",retryAnalyzer=RetryAnalyzer.class,dependsOnMethods="verifyLoginBtnFunctionalityByUsingValidData",priority=2,enabled=true,description="Here searchBox functionality with valid data")
	public void VerifysearchBoxWithValidData() throws Exception {
		String data=ReadData.Getdata("dashboardpage", 1, 0);
		DashBoardPage obj=new DashBoardPage(driver);
		obj.setTextInSearchBox(data);
		List result=obj.verifySuggestedList(data);
		Assert.assertTrue((boolean)result.get(0),"List does not contain valid data");
		Assert.assertEquals((int)result.get(1),1,"List contains Duplicate values");
		
		
	}
}
		