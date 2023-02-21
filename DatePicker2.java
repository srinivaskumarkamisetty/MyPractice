package interviewprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2  {
  public static WebDriver driver;
  
  public void OpenBrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
  }
  
  public void OpenUrl(String url) {
	  driver.navigate().to(url);
  }
  
  public void Scroll(WebElement ele) {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true)", ele);
	  
  }
  public WebElement getElement(String locator) {
	  By ExampleBtnL=By.xpath("//*[text()='"+locator+"']");
	  WebElement ExampleBtn=driver.findElement(ExampleBtnL);
	  return ExampleBtn;
  }
  
  public void clickonTextBox() {
	 By TextBoxL= By.cssSelector("#datepicker");
	 WebElement TextBox= driver.findElement(TextBoxL);
	 TextBox.click();
  }
  public void clickonNxtBtn(int n) {
	  
	  for(int i=0;i<=n;i++) {
		  WebElement NxtBtnL=this.getElement("Next");
		  NxtBtnL.click();
	  }
	
  }
  public void ClickonDate(int n) {
	By dateL=	By.xpath("//a[text()='"+n+"']");
	WebElement date=driver.findElement(dateL);
	date.click();
	}
  
  public static void main(String[] args) throws Exception {
	  DatePicker2 obj=new DatePicker2();
	  obj.OpenBrowser();
	  obj.OpenUrl("https://jqueryui.com/datepicker/");
	  Screenshot.takescteenshot(driver, "img1");
	  obj.driver.manage().window().maximize();
	  WebElement examples=obj.getElement("Examples");
	  obj.Scroll(examples);
	  Screenshot.takescteenshot(driver, "img2");
	  obj.driver.switchTo().frame(0);
	  obj.clickonTextBox();
	  obj.clickonNxtBtn(4);
	  obj.ClickonDate(7);
	  Screenshot.takescteenshot(driver, "img3");
}
}
