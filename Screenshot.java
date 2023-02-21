package interviewprogrammes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	
	public static void takescteenshot(WebDriver driver,String imagename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trs=new File(".\\screenshot\\"+imagename+"\\.png");
		FileUtils.copyFile(src, trs);
		
	}
	}
