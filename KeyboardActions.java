package interviewprogrammes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions extends DatePicker2 {
	
	public void GetLocators( String locator) {
		By TextBoxL=By.xpath("//textarea[@id='"+locator+"']");
		WebElement TextBox=driver.findElement(TextBoxL);
		TextBox.sendKeys("Srinivaskumar");
	}
	public void CopyText() {
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		// CTRL+C
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		System.out.println("Text copied");
		//TAB
		action.sendKeys(Keys.TAB);
		
		//CTRL+V
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		driver.close();
	}
	
public static void main(String[] args) throws IOException {
	KeyboardActions obj=new KeyboardActions();
	obj.OpenBrowser();
	obj.OpenUrl("https://text-compare.com/");
	Screenshot.takescteenshot(driver, "image2");
	obj.GetLocators("inputText1");
	obj.CopyText();
	
}
	
}
