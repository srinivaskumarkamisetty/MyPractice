package interviewprogrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		String month = "mar";
		String year = "2023";
		String date = "6";

		By DateL = By.xpath("//input[@id='onward_cal']");
		WebElement Date = driver.findElement(DateL);
		Date.click();

		while (true) {
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			 //System.out.println(monthyear);

			String arr[] = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			System.out.println(mon);
			System.out.println(yr);

			if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
				break;
			else 
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
				
			List<WebElement> day = driver.findElements(By.xpath("//tbody/tr[3]//td"));

			for (WebElement Element : day) {

				String text = Element.getText();
				if (text.equals(date)) {
					System.out.println("Ready to click");
					Element.click();
					break;
				}}
			}
		}
	}


