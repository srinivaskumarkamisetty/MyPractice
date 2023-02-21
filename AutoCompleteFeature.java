package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoCompleteFeature extends CommonMethods{
	WebElement GoolesearchBox;
	
	public void SetTextInGoogleSearchBox(String data) {
		
		
	By GoolesearchBoxL=	By.xpath("//*[@name='q']");
	 GoolesearchBox=driver.findElement(GoolesearchBoxL);
	GoolesearchBox.sendKeys(data);
	}
	
	public void selectOptionfromSuggestedlist(int position) throws Exception {
		for(int i=1;i<=position;i++) {
			
			Thread.sleep(3000);
			GoolesearchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		}
		 GoolesearchBox.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
	}
	
	@Test
public static void main(String[] args) throws Exception {
	AutoCompleteFeature obj=new AutoCompleteFeature();
	obj.launchBrowser();
	obj.openUrl("https://www.google.co.in/");
	obj.SetTextInGoogleSearchBox("selenium");
	obj.selectOptionfromSuggestedlist(4);
}
}
