package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpaths {
	static WebDriver driver;
    @BeforeTest
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openW3Schools() {
		driver.get("https://www.w3schools.com/html/");
		By ExerciseBtnL=By.xpath("/html/body/div[1]/a[4]");
		WebElement ExerciseBtn=driver.findElement(ExerciseBtnL);
		ExerciseBtn.click();
	}
	@Test(priority=1)
	public void OpenHYRtutorials() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		By FirstNameBtnL=By.xpath("//*[@maxlength='10']");
		WebElement FirstNameBtn=driver.findElement(FirstNameBtnL);
		FirstNameBtn.sendKeys("Vasu");
		
		By LastNameBtnL=By.xpath("//*[@maxlength!='10']");
		WebElement LastNameBtn=driver.findElement(LastNameBtnL);
		LastNameBtn.sendKeys("kamisetty");
	}
	@Test (priority=2)
    public void AmazonAccountsList() {
    	driver.get("https://www.amazon.in/");
    	By AccountAndListsBtnL=By.xpath("//*[text()='Account & Lists']");
    	WebElement AccountAndListsBtn=driver.findElement(AccountAndListsBtnL);
    	AccountAndListsBtn.click();
    	
    	List<WebElement> AccountAndListsBtn1=driver.findElements(AccountAndListsBtnL);
    	for (WebElement Element : AccountAndListsBtn1) {
    	if(Element.isDisplayed()) {
    		System.out.println(Element.getText());
    	}
    	
			
		}
    	
    }
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
