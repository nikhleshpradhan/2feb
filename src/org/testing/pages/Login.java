package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	
	public void signin(String User, String passwords) throws Exception
	{
		List <WebElement>  s = driver.findElements(By.xpath(pr.getProperty("signbutton")));
		
		System.out.println(s.size());
		
		s.get(1).click();
		
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(User);
		driver.findElement(By.xpath(pr.getProperty("next"))).click();
		 Thread.sleep(10000);
			
		//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[3]")).sendKeys(passwords);
		
		 WebElement password =  driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys(passwords);
		 driver.findElement(By.xpath(pr.getProperty("next"))).click();
		 Thread.sleep(10000);
	}
}
//*[@id="password"]/div[1]/div/div[1]/input