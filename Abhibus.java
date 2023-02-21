package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Abhibus {
	public static WebDriver driver;

	public static void launchBrowser(String browsername) {
		System.setProperty("webdriver.edge.driver", "E:\\webdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}

	public static void GetUrl(String url) {
		driver.get(url);
	}

	public static void EnterDestination(String placename) {
		By EnterDestinationBL = By.xpath("//*[@id='source']");
		WebElement EnterDestinationB = driver.findElement(EnterDestinationBL);
		EnterDestinationB.sendKeys(placename);
		for (int i=0;i<=0;i++) {
			EnterDestinationB.sendKeys(Keys.ARROW_DOWN);
			EnterDestinationB.sendKeys(Keys.ENTER);
	

		}

	}

	public static void EnterDepDestination(String DepaturePlace) {
		By EnterDepDestinationBL = By.xpath("//*[@id='destination']");
		WebElement EnterDepDestinationB = driver.findElement(EnterDepDestinationBL);
		EnterDepDestinationB.sendKeys(DepaturePlace);
		for (int i = 0; i<= 0;i++ ) {
			EnterDepDestinationB.sendKeys(Keys.ARROW_DOWN);
			EnterDepDestinationB.sendKeys(Keys.ENTER);
			
		}

	}

	public static void EnterDateFormat() {
		By EnterdateBL = By.xpath("//*[@id='datepicker1']");
		WebElement EnterDatebtn = driver.findElement(EnterdateBL);
		EnterDatebtn.sendKeys(Keys.ENTER);

		By DateBL = By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td");
		List<WebElement> DateL = driver.findElements(DateBL);
		for (WebElement Element : DateL) {
			String data = Element.getText();

			if (data.equals("15"))
				Element.click();

		}
	}

	public static void SearchBuses() {

		By SearchBusesBL = By.xpath("//*[text()='Search']");
		WebElement SearchBusesB = driver.findElement(SearchBusesBL);
		Actions action = new Actions(driver);
		action.click(SearchBusesB).build().perform();
	}

	public static void main(String[] args) {

		Abhibus.launchBrowser("edge");
		Abhibus.GetUrl("https://www.abhibus.com/");
		Abhibus.EnterDestination("ongole");
		Abhibus.EnterDepDestination("Bangalore");
		Abhibus.EnterDateFormat();
		Abhibus.SearchBuses();

	}
}

/*
 * By DropdownL=By.cssSelector("select#searchDropdownBox"); WebElement
 * Dropdown=driver.findElement(DropdownL);
 * 
 * Select select=new Select(Dropdown); select.selectByIndex(5);
 * select.selectByVisibleText("Baby");
 * 
 * /*for(int i=0;i<3;i++) { SearchBox.sendKeys(Keys.ARROW_DOWN);
 * Thread.sleep(3000); } SearchBox.sendKeys(Keys.ENTER); Thread.sleep(3000);
 * driver.close();
 */
