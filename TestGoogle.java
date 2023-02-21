package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestGoogle {
	static WebDriver driver;

	@BeforeTest
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";

		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title Mismatched");

	}

	@Test(priority = 1)
	public void OpenFacebook() throws Exception {

		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		By EmailIDL = By.xpath("//*[@type='text']");
		WebElement EmailID = driver.findElement(EmailIDL);
		EmailID.sendKeys("vasu");
		EmailID.sendKeys(Keys.ENTER);

	}
}