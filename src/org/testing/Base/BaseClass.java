package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.Logs;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
public ChromeDriver driver;
public Properties pr;
	
	@BeforeTest()
	
	public void openBrowser() 
	{
		
		
			System.setProperty("webdriver.chrome.driver","\\TravelMint\\Demoone\\chromedriver.exe");
	try
			{
				driver= new ChromeDriver();
			   	driver.manage().window().maximize();
			   	driver.get("https://www.youtube.com/");
	            Thread.sleep(10000);
	            
	            Logs.takeLogs("BaseClass", "Youtube home page launch");
			}
			
	catch(Exception e)
	
			{
				Logs.takeLogs("BaseClass", "Base Class Fail");
				
			}
		   	
	try
			{
		
		
		  File f = new File ("D:\\TravelMint\\Demoone\\src\\org\\testing\\Object\\OR.properties");
		  FileInputStream fi = new FileInputStream(f);
		  pr = new Properties();
		  pr.load(fi);
		  
		    Logs.takeLogs("BaseClass", "Repository get logged successfully");
		    
			}
	catch(Exception e)
	
			{
				Logs.takeLogs("BaseClass", "Repository Load fail");
				
			}
		   	
}
}
