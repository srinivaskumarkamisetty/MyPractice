package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	public WebDriver driver;
	
	
	
	public  void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver_win32");
		driver=new ChromeDriver();
		
	}
	public void openUrl(String Url) {
		driver.get(Url);
	}
	public String GetCurrentPageTitle() {
		return driver.getTitle();
	}
	public boolean CompareTitle(String expectedTitle,String actualTitle) {
		//return expectedTitle.equalsIgnoreCase(actualTitle);
		return actualTitle.toLowerCase().contains(expectedTitle.toLowerCase());
	}
	public void DisplayTestScriptStatus(boolean status) {
		if(status)
			System.out.println("Test script pass");
		else
			System.out.println("Test script fail");
	}
	public void closeBrowser() {
		driver.close();
	}

}
