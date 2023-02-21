package interviewprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		WebElement btn=driver.findElement(By.id("pickfiles"));
		
		btn.sendKeys("C:\\Users\\home\\Downloads\\Srinivaskumar_Kamisetty.pdf");
		btn.click();
	}
}
