package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProperties {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
			driver.get("https://www.w3schools.com/html/");
			By ExerciseBtnL=By.xpath("/html/body/div[1]/a[4]");
			WebElement element=driver.findElement(ExerciseBtnL);
			System.out.println(element.getTagName());
			
			By ExerciseBtnL1=By.xpath("/html/body/div[1]/a[4]");
			WebElement element1=driver.findElement(ExerciseBtnL1);
			System.out.println(element1.getAttribute("class"));
			
			By ExerciseBtnsL1=By.xpath("//*[@class='w3-col l3 m6']");
			List <WebElement> ExerciseBtnsL=driver.findElements(ExerciseBtnsL1);
			for (WebElement Element : ExerciseBtnsL) {
				
					System.out.println(Element.getText());
				}
			}
	}


