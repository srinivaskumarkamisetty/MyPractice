package interviewprogrammes;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Get All Cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Total No of Cookies"+cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "  :  " + cookie.getValue());
		}
		//Add Cookies
		Cookie cookieobj=new Cookie("vasu","1234");
		driver.manage().addCookie(cookieobj);
		Set<Cookie> cookiess = driver.manage().getCookies();
		System.out.println("Total No of Cookies"+cookiess.size());
		
		
		//Delete Cookie
		driver.manage().deleteCookie(cookieobj);
		cookiess = driver.manage().getCookies();
		System.out.println("Total No of Cookies"+cookiess.size());
		
		//Delete All cookies
		driver.manage().deleteAllCookies();
		cookiess = driver.manage().getCookies();
		System.out.println("Total No of Cookies"+cookiess.size());
}
}