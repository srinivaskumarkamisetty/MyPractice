package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static WebDriver driver;
	public static void launchBrowser(String browsername) {
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}

	public static void GetUrl(String url) {
		driver.get(url);
	}
	public static void EnterMonth() {
		By MonthBL=By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]");
		WebElement MonthBtn=driver.findElement(MonthBL);
		MonthBtn.getText();}
	public static void main(String[] args) {
		Datepicker.launchBrowser("chrome");
		Datepicker.GetUrl("https://www.redbus.in/");
		Datepicker.EnterMonth();
	}
	
}
