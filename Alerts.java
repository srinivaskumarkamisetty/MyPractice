package interviewprogrammes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
	public static WebDriver driver;

	public void launcbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openurl(String url) {
		driver.get(url);

	}
	public void clickonbutton(String text) {
		By AlertBtnL=By.xpath("//*[contains(text(),'"+text+"')]");
		WebElement AlertBtn=driver.findElement(AlertBtnL);
		Actions action=new Actions(driver);
		action.click(AlertBtn).build().perform();
		
	}
	public static void main(String[] args) throws Exception {
		Alerts alert=new Alerts();
		alert.launcbrowser();
		alert.openurl("https://demo.automationtesting.in/Alerts.html");
		
		/*------------CONFIRMATION ALERT----------
		alert.clickonbutton("Alert with OK & Cancel");
		Thread.sleep(2000);
		alert.clickonbutton("click the button to display a confirm box ");
		Thread.sleep(2000);
		Alert alert2=driver.switchTo().alert();
	   System.out.println(alert2.getText());
	   alert2.accept();*/
		
		/*------------SIMPLE ALERT -------------
		alert.clickonbutton("Alert with OK ");
		alert.clickonbutton("click the button to display an  alert box:");
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();*/
		
		
		alert.clickonbutton("Alert with Textbox");
		alert.clickonbutton("click the button to demonstrate the prompt box ");
		Alert alert2=driver.switchTo().alert();
		Screenshot.takescteenshot(driver, "image2");
		alert2.getText();
		alert2.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		alert2.sendKeys("vasu");
		alert2.accept();
		
		
	
		
	}
}
