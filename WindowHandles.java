package interviewprogrammes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {
public static WebDriver driver;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();	
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	
	 
	 By LinkL=By.linkText("a[href='http://www.orangehrm.com']");
	 WebElement Link=driver.findElement(LinkL);
	 
	 Actions action=new Actions(driver);
	 action.moveToElement(Link);
	 action.click(Link).build().perform();
	 
	Set<String> windows=driver.getWindowHandles();
	
	List<String> windowID=new ArrayList(windows);
	String parentwindow=windowID.get(0);
	String childwindow=windowID.get(1); 
	
	System.out.println(parentwindow);
	System.out.println(childwindow);
	
}

}
