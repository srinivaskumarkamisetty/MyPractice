package com.nopcommerce.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.nopcommerce.utils.ReadData;

public class DashBoardPage {
 private WebDriver driver;
 public DashBoardPage(WebDriver driver) {
	 this.driver=driver;
 }
 public boolean isDashboardLabelVisible() throws Exception {
	String dashbordlabel_L= ReadData.GetLocator("dashboard", "dashbordlabel_L");
	By dashbordlabelL=By.xpath(dashbordlabel_L);
	WebElement dashbordlabel=driver.findElement(dashbordlabelL);
	return dashbordlabel.isDisplayed();
 }
 public void setTextInSearchBox(String data) throws Exception {
	 String searchBox_L= ReadData.GetLocator("dashboard", "searchBox_L");
		By searchBoxL=By.xpath(searchBox_L);
		WebElement searchBox=driver.findElement(searchBoxL);
		searchBox.sendKeys(Keys.chord(Keys.CONTROL,"a"),data);
		
 }
public String getInvalidMessage() throws Exception {
	String invalidErrormsg_L= ReadData.GetLocator("dashboard", "invalidErrormsg_L");
	By invalidErrormsgL=By.xpath(invalidErrormsg_L);
	WebElement invalidErrormsg=driver.findElement(invalidErrormsgL);
	return invalidErrormsg.getText();
}
 public List verifySuggestedList(String Expecteddata) throws Exception {
	 boolean status=true;
	 String suggestedlist_L= ReadData.GetLocator("dashboard", "suggestedlist_L");
		By suggestedlistL=By.xpath(suggestedlist_L);
		List<WebElement> suggestedlist=driver.findElements(suggestedlistL);
		for (WebElement Element : suggestedlist) {
		String Actualdata=	Element.getText();
		Actualdata=Actualdata.toLowerCase();
		Expecteddata=Expecteddata.toLowerCase();
		if(!Actualdata.contains(Expecteddata)) {
			status=false;
			break;
		}
		
			
		}
		List results=new ArrayList();
		results.add(status);
		results.add(suggestedlist.size());
		return results;
		
 }
}
