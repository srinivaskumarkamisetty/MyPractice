package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdrown {
static WebDriver driver;

public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	
	By DropdownL=By.xpath("//*[@id='course']");
	WebElement Dropdown=driver.findElement(DropdownL);
	Select dropdownlist=new Select(Dropdown);
	List <WebElement> options=dropdownlist.getOptions();
	for (WebElement Element : options) {
		System.out.println(Element.getText());
		
		dropdownlist.selectByIndex(1);
		Thread.sleep(3000);
		dropdownlist.selectByValue("python");
		Thread.sleep(3000);
		dropdownlist.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
	}
}
}