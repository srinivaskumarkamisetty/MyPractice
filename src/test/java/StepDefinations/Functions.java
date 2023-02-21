package StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Functions {
	public WebDriver driver;
	@Given("user need to be on NopDemo Homepage")
	public void user_need_to_be_on_nop_demo_homepage() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	   
	}

	@When("user enter invalid email format")
	public void user_enter_invalid_email_format() {
		By EmailL=By.xpath("//*[@name='Email']");
		WebElement Email=driver.findElement(EmailL);
		Email.clear();
		Email.sendKeys("abc");
		Email.sendKeys(Keys.ENTER);
	   
	}

	@Then("wrong email message must be visible")
	public void wrong_email_message_must_be_visible() {
	   By WrongMsgL=By.xpath("//*[text()='Wrong email']");
	   WebElement WrongMsg=driver.findElement(WrongMsgL);
	   Assert.assertTrue(WrongMsg.isDisplayed());
	  
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	   
	}
	@When("user clear email field")
	public void user_clear_email_field() {
		By EmailL=By.xpath("//*[@name='Email']");
		WebElement Email=driver.findElement(EmailL);
		Email.clear();
	   
	}
	@When("click on login button")
	public void click_on_login_button() {
	
			By loginBtnL=By.xpath("//*[@type='submit']");
			WebElement loginBtn=driver.findElement(loginBtnL);
			loginBtn.click();
	   
	}
	@Then("please enter your email msg should be visible")
	public void please_enter_your_email_msg_should_be_visible() {
	   By PleaseEnterMailMsgL= By.xpath("//span[@id='Email-error']");
	   WebElement PleaseEnterMailMsg=driver.findElement(PleaseEnterMailMsgL);
	   Assert.assertTrue(PleaseEnterMailMsg.isDisplayed());
	}
	@When("user enter valid email {string}")
	public void user_enter_valid_email(String email) {
		By EmailL=By.xpath("//*[@name='Email']");
		WebElement Email=driver.findElement(EmailL);
		Email.clear();
		Email.sendKeys(email);
		
	}
	@When("user enter valid password")
	public void user_enter_valid_password(DataTable dataTable) {
	
		List<List<String>> data=dataTable.asLists();
		String pass=data.get(2).get(0);
		By PasswordL=By.xpath("//*[@name='Password']");
		WebElement Password=driver.findElement(PasswordL);
		Password.clear();
		Password.sendKeys(pass);
	}
	@Then("verify dashboard label")
	public void verify_dashboard_label() {
	    By DahboardL=By.xpath("//h1[normalize-space()='Dashboard']");
	    WebElement Dashboard=driver.findElement(DahboardL);
	    Assert.assertTrue(Dashboard.isDisplayed());
	}




}
