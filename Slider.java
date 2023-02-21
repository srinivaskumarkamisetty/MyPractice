package interviewprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider extends DatePicker2{
	
	public void GetElement() {
		
		
	By sliderL	=By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']");
	WebElement slider=driver.findElement(sliderL);
	System.out.println("Size="+slider.getSize());
	
	System.out.println("Location="+slider.getLocation());
	
	Actions action=new Actions(driver);
	Action act= action.dragAndDropBy(slider, 55, 0).build();
	act.perform();
	
	
	
	
	
	}
	public static void main(String[] args) {
		Slider obj=new Slider();
		obj.OpenBrowser();
		obj.OpenUrl("https://jqueryui.com/slider/");
		WebElement examples=obj.getElement("Examples");
		obj.Scroll(examples);
		obj.driver.switchTo().frame(0);
		
		obj.GetElement();
	}

}
