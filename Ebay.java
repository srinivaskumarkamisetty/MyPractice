package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {
	public WebDriver driver;
	public  void launchBrowser() {
		System.setProperty("webdriver.edge.driver", "E:\\webdriver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	public void openUrl(String Url) {
		driver.get(Url);
	}
	public void ClickonCategories() {
	By categoriesL=	By.xpath("//*[@class='gh-sb ']");
	WebElement categories=driver.findElement(categoriesL);
	categories.click();
	}
	public void GetAllLinks() throws  Exception {
		By categoriesL=	By.xpath("//*[@class='gh-sb ']");
		List<WebElement> categories=driver.findElements(categoriesL);
		for (WebElement Element : categories) {
			if(Element.isDisplayed()) {
				System.out.println(Element.getText());
			}
		
	
			//Right click
			Actions action=new Actions(driver);
			action.contextClick(Element).build().perform();
			Thread.sleep(3000);
			
			//Open link in NewTab
			
			Robot robo=new Robot();
			robo.keyPress(KeyEvent.
					VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	
	public static void main(String[] args) throws Exception {
		Ebay obj=new Ebay();
		obj.launchBrowser();
		obj.openUrl("https://www.ebay.com/");
		obj.ClickonCategories();
		obj.GetAllLinks();
		
	}
}
