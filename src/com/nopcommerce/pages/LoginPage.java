package com.nopcommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.nopcommerce.utils.ReadData;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private void SetEmail(String email) throws Exception {
		String email_L = ReadData.GetLocator("loginpage", "email_L");
		By emailL = By.id(email_L);
		WebElement emailtxtboxL = driver.findElement(emailL);
		emailtxtboxL.sendKeys(Keys.chord(Keys.CONTROL, "a"), email);
	}

	private void Setpassword(String password) throws Exception {
		String password_L = ReadData.GetLocator("loginpage", "password_L");
		By passwordL = By.id(password_L);
		WebElement passwordtxtboxL = driver.findElement(passwordL);
		passwordtxtboxL.sendKeys(Keys.chord(Keys.CONTROL, "a"), password);
	}

	private void ClickonloginBtn() throws Exception {
		String loginBtn_L = ReadData.GetLocator("loginpage", "loginBtn_L");
		By loginBtnL = By.xpath(loginBtn_L);
		WebElement loginBtn = driver.findElement(loginBtnL);
		loginBtn.click();
	}
public void nopcommerceLogin(String email,String password) throws Exception {
	
	Reporter.log("login execution started");
	this.SetEmail(email);
	this.Setpassword(password);
	this.ClickonloginBtn();
	Reporter.log("login Btn clicked");
}

public boolean Verifyinvalidmsg(String msg1, String msg2) throws Exception {
	String errormsg_L=ReadData.GetLocator("loginpage", "errormsg_L");
	By errormsgL=By.xpath(errormsg_L);
	WebElement errormsg=driver.findElement(errormsgL);
	String errormsgs=errormsg.getText();
	String error[]=errormsgs.split("\n");
	boolean status1=msg1.equals(error[0]);
	boolean status2=msg1.equals(error[1]);
	return status1&&status2;
}
}