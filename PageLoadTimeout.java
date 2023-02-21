
package interviewprogrammes;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		driver.get("https://www.simplyhired.co.in/profile");
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());

		Duration duration = Duration.between(startTime, endTime);
		long difference=duration.toMillis()/1000;
	      System.out.println("difference seconds="+difference);
	      
	      
	      //.title.topictitle1.bx--type-expressive-heading-05
	}

}
