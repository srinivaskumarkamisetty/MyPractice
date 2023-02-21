package interviewprogrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipledropdrown {
public static WebDriver driver;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();	
	 
	 driver.get("https://itera-qa.azurewebsites.net/home/automation");
	 
	 By dropdownL=By.xpath("//*[@type='checkbox' and contains(@id,'day')]");
	 List<WebElement> dropdown=driver.findElements(dropdownL);
	 System.out.println(dropdown.size());
	 
	 
	/* for(int i=0;i<dropdown.size();i++) {
		 dropdown.get(i).click();
	 }
	 
   for (WebElement Element : dropdown) {
	String checkbox=Element.getAttribute("id");
	if(checkbox.equals("monday")||checkbox.equals("sunday")) {
		Element.click();
	}*/
	 
	 for(int i=dropdown.size()-2;i<=dropdown.size();i++) {
		 dropdown.get(i).click();
		 
	 }
	 
	
}
}

	


