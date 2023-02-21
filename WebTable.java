package interviewprogrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static WebDriver driver;

	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void OpenURL(String url) {
		driver.navigate().to(url);
	}

	public void GetNumberOfRows() {
		By tableL = By.xpath("//*[@id='customers']//tr");
		List<WebElement> table = driver.findElements(tableL);
		System.out.println("Table size=" + table.size());
	}

	public int GetTotalDataInTable() {
		By tableL = By.xpath("//*[@id='customers']//tr");
		List<WebElement> table = driver.findElements(tableL);
		System.out.println("Table size=" + table.size());
		for (int i = 1; i <= table.size(); i++) {
			By Rows = By.xpath("//*[@id='customers']//tr[" + i + "]");
			WebElement TotalData = driver.findElement(Rows);
			String data = TotalData.getText();
			System.out.println(data);
			
		}
return table.size();
	}


	

	public static void main(String[] args) {
		WebTable table = new WebTable();
		table.LaunchBrowser();
		table.OpenURL("https://www.techlistic.com/p/demo-selenium-practice.html");
		table.GetNumberOfRows();
		table.GetTotalDataInTable();

	}
}
