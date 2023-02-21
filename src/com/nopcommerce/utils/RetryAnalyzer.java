package com.nopcommerce.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retraycount = 0;
	private static int maxcount = 3;

	public boolean retry(ITestResult result) {
		if (retraycount < maxcount) {
			retraycount++;
			return true;
		}

		return false;
	}

}
