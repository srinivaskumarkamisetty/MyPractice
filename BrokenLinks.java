package interviewprogrammes;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static WebDriver driver;

	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void OpenURL(String url) {
		driver.navigate().to(url);
	}

	public void VerifyBrokenLinkorNot() throws Exception {

		By allLinksL = By.tagName("a");
		List<WebElement> allLinks = driver.findElements(allLinksL);
       int brokenlinks=0;
		for (WebElement Element : allLinks) {
			String url = Element.getAttribute("href");
			URL links=new URL(url);
			try {
				
				HttpURLConnection connection=(HttpURLConnection) links.openConnection();
				connection.connect();
				if(connection.getResponseCode()>=400) {
					System.out.println(connection.getResponseCode()+"is Broken link");
					brokenlinks++;
				}
				else {
					System.out.println(connection.getResponseCode()+"is not broken link");
				}
				
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}

		}

		 System.out.println(brokenlinks);
}
	
	public static void main(String[] args) throws Exception {
		BrokenLinks brokenlinks=new BrokenLinks();
		brokenlinks.OpenBrowser();
		brokenlinks.OpenURL("http://www.deadlinkcity.com/");
		brokenlinks.VerifyBrokenLinkorNot();
	}
}