package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods {
	public static WebDriver driver;

	public static void launchBrowser(String browsername) {
		System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	public static void GetUrl(String url) {
		driver.get(url);
	}

	public static void managebookings() {
		By manageBookingsBL = By.xpath("//*[@class='manageHeaderLbl']");
		WebElement manageBookingsB = driver.findElement(manageBookingsBL);
		manageBookingsB.click();
		
	}

	public static void EnterDestination(String placename) {
		By EnterDestinationBL = By.xpath("//*[@id='src']");
		WebElement EnterDestinationB = driver.findElement(EnterDestinationBL);
		
		EnterDestinationB.sendKeys(placename);
		for (int i = 0; i<1; i++) {
			EnterDestinationB.sendKeys(Keys.ARROW_DOWN);

		}
		EnterDestinationB.sendKeys(Keys.ENTER);
	}

	public static void EnterDepDestination(String DepaturePlace) {
		By EnterDepDestinationBL = By.xpath("//*[@id='dest']");
		WebElement EnterDepDestinationB = driver.findElement(EnterDepDestinationBL);
		EnterDepDestinationB.sendKeys(DepaturePlace);
		for (int i = 0; i<2; i++) {
			EnterDepDestinationB.sendKeys(Keys.ARROW_DOWN);

		}
		EnterDepDestinationB.sendKeys(Keys.ENTER);
	}

	public static void EnterDateFormat() {
		By EnterdateBL = By.xpath("//*[@id='onward_cal']");
		WebElement EnterDatebtn = driver.findElement(EnterdateBL);
		EnterDatebtn.sendKeys(Keys.ENTER);

		By DateBL = By.xpath("//*[@class='rb-monthTable first last']//tbody//tr//td");
		List<WebElement> DateL = driver.findElements(DateBL);
		for (WebElement Element : DateL) {
			String data = Element.getText();
			System.out.println(data);

			if (data.equals("15"))
				Element.click();
			

		}
	}

	public static void SearchBuses() {

		By SearchBusesBL = By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/button");
		WebElement SearchBusesB = driver.findElement(SearchBusesBL);
		Actions action = new Actions(driver);
		action.click(SearchBusesB).build().perform();
		System.out.println("buses");

	}

	public static void main(String[] args) {

		Methods.launchBrowser("chrome");
		Methods.GetUrl("https://www.redbus.in/");
		Methods.managebookings();
		Methods.EnterDestination("ongole");
		Methods.EnterDepDestination("Bangalore");
		Methods.EnterDateFormat();
		Methods.SearchBuses();

	}
}