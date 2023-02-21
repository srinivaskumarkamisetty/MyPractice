package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonAutoCompleteFeaturte extends CommonMethods{
	
	public void SetTextInAmazonTextBox(String data) {
	By amazonSearchBL=By.xpath("//*[@type='text']");
	WebElement amazonSearchB=driver.findElement(amazonSearchBL);
	amazonSearchB.sendKeys(data);
	}
public void getSuggestedList() {
By amazonSuggestedlistL=	By.xpath("//*[@class='autocomplete-results-container']//child::*[@class='s-suggestion-container']//child::*[@class='s-suggestion s-suggestion-ellipsis-direction']//span");
List<WebElement> amazonSuggestedlist=driver.findElements(amazonSuggestedlistL);
for (WebElement Element : amazonSuggestedlist) {
	if(Element.isDisplayed()) {
	
	System.out.println(Element.getText());
}
}}

public static void main(String[] args) {
	 AmazonAutoCompleteFeaturte obj=new  AmazonAutoCompleteFeaturte();
	 obj.launchBrowser();
	 obj.openUrl("https://www.amazon.in/");
	 obj.SetTextInAmazonTextBox("smart");
	 obj.getSuggestedList();
	 
}
}
