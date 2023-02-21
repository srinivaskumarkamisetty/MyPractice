package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxLinkTextRadioButtons {
	static WebDriver driver;
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	By NameBtnL= By.xpath("//*[@id='firstName']");
	WebElement NameTxt=driver.findElement(NameBtnL);
	NameTxt.sendKeys("vasu");
	String data=NameTxt.getAttribute("value");
	System.out.println(data);
	Thread.sleep(3000);
	
	By GenderBtnL=By.xpath("//*[@id='femalerb']");
	WebElement GenderBtn=driver.findElement(GenderBtnL);
	GenderBtn.click();
	
	By GenderBtnL1=By.xpath("//*[@id='femalerb']");
	WebElement GenderBtn1=driver.findElement(GenderBtnL1);
	if(GenderBtn1.isSelected()) {
		GenderBtn1.click();
	}
	By LanguageBtnL=By.xpath("//*[@id='englishchbx']");
	WebElement LanguageBtn=driver.findElement(LanguageBtnL);
	LanguageBtn.click();
	
	By RegisterBtnL=By.xpath("//*[@id='registerbtn']");
	WebElement RegisterBtn=driver.findElement(RegisterBtnL);
	RegisterBtn.click();
	
	By SuccessMsgL=By.xpath("//*[@id='msg']");
	WebElement SuccessMsg=driver.findElement(SuccessMsgL);
	SuccessMsg.getText();
	
	By LinkL=By.linkText("Click here to navigate to the home page");
	WebElement Link=driver.findElement(LinkL);
	Link.click();
}
}
