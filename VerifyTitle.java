package practice;

import org.testng.annotations.Test;

public class VerifyTitle {
	@Test
public void verifythecurrentTitle() {
	CommonMethods obj=new CommonMethods();
	obj.launchBrowser();
	obj.openUrl("https://www.simplyhired.co.in/");
	String actualTitle=obj.GetCurrentPageTitle();
	boolean status=obj.CompareTitle("simplyHired", actualTitle);
	obj.DisplayTestScriptStatus(status);
	
	
}
}
