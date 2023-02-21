package com.nopcommerce.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	private static WebDriver driver;

	public static WebDriver launchBrowser(String browsername, String drivername, String driverpath) {
		System.setProperty(drivername, driverpath);
		if (browsername.equals("Chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}
		return driver;
	}
	public static void openUrl(String Url) {
		driver.get(Url);
	}
	public static void CloseBrowser() {
		driver.close();
	}
}
