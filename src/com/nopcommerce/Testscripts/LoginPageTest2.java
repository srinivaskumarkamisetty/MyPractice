package com.nopcommerce.Testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopcommerce.pages.DashBoardPage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.utils.Browser;
import com.nopcommerce.utils.ReadData;
import com.nopcommerce.utils.RetryAnalyzer;



public class LoginPageTest2 {
private WebDriver driver;
@BeforeMethod(alwaysRun=true)
public void setup() throws Exception {
	java.util.List<String> browserdata=ReadData.Getdata("browser",1);
	String browsername=browserdata.get(0);
	String drivername=browserdata.get(1);
	String driverpath=browserdata.get(2);
	String Url=browserdata.get(3);
	driver=Browser.launchBrowser(browsername, drivername, driverpath);
	Browser.openUrl(Url);
	
}
@AfterMethod
public void teardown() {
	Browser.CloseBrowser();
	
}
@Test(groups="smoke",retryAnalyzer=RetryAnalyzer.class,dataProvider="loginCredentials",enabled=true,description="Here login button functionality with valid data")
public void verifyLoginBtnFunctionalityByUsingValidData(String email,String password) throws Exception {
	
	LoginPage login=new LoginPage(driver);
	login.nopcommerceLogin(email, password);
	DashBoardPage obj=new DashBoardPage(driver);
	Assert.assertTrue(obj.isDashboardLabelVisible()," Script failed DashBoard not visible");
}
@DataProvider(name="loginCredentials")
public String[][] lodinData() throws Exception {
	String info[][]=ReadData.Getdata("loginpage");
	return info;
}
}