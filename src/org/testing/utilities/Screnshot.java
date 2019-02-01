package org.testing.utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screnshot {
	
	public static void takeScreenshot(ChromeDriver driver, String pathname) throws Exception
	{
		
File f = driver.getScreenshotAs(OutputType.FILE);
	
   FileUtils.copyFile(f,new File(pathname));
	
	}

}
