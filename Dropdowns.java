package interviewprogrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	WebDriver driver;
	public Dropdowns() {
	
}
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	public void openurl(String Url) {
		driver.navigate().to(Url);
	}
	public void selectdropdown() throws Exception {
		
		By countryBtnL=By.id("input-country");
		WebElement countryBtn=driver.findElement(countryBtnL);
		
		Select select=new Select(countryBtn);
		/*select.selectByVisibleText("Afghanistan");
		select.selectByValue("2");
		select.selectByIndex(3);*/
		List<WebElement> dropdown=select.getOptions();
		
		for (WebElement Element : dropdown) {
			if(Element.getText().equals("cuba"));{
				
				Thread.sleep(3000);
				Element.click();
				break;
			}
		}
	
		
		
	}
	public static void main(String[] args) throws Exception {
		Dropdowns drop=new Dropdowns();
		drop.launchbrowser();
		drop.openurl("https://www.opencart.com/index.php?route=account/register");
		drop.selectdropdown();
	}
}