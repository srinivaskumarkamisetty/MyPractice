package interviewprogrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktestAndPartialLinkTest {
	public static WebDriver driver;

	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void OpenURL(String url) {
		driver.navigate().to(url);
	}

	public void GetAllLinks() {
		By AllLinksL = By.tagName("a");
		List<WebElement> AllLinks = driver.findElements(AllLinksL);
		System.out.println(AllLinks.size());
		// To get ALLlinks
		
		for (WebElement Element : AllLinks) {
			System.out.println(Element.getText());
		}
	}

	public void VerifyLinkText() {
		By LinkTextBtnL = By.linkText("Gift Cards");
		WebElement LinkTextBtn = driver.findElement(LinkTextBtnL);
		LinkTextBtn.click();
	}

	public void VerifyLinkWithPartialLinkText() {
		By LinkTextBtnL = By.partialLinkText("Gift");
		WebElement LinkTextBtn = driver.findElement(LinkTextBtnL);
		LinkTextBtn.click();
	}

	public static void main(String[] args) {
		LinktestAndPartialLinkTest links = new LinktestAndPartialLinkTest();
		links.OpenBrowser();
		links.OpenURL("https://www.amazon.in/");
		// links.VerifyLinkText();
		 links.GetAllLinks();
		//links.VerifyLinkWithPartialLinkText();
	}
}
