package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.pages.Login;
import org.testing.utilities.Screnshot;
import org.testng.annotations.Test;

public class TC1 extends BaseClass {
	
	
	
	@Test()
	public void tranding() throws Exception
	{ 
		
	Login l = new Login(driver, pr);
	l.signin("anuragsharma121111@gmail.com","Hello@123");
	 System.out.println("TC1");
	 List<WebElement> t =	driver.findElements(By.id(pr.getProperty("tranding")));
	 System.out.println(t.size()); 
	 t.get(1).click();
	 
	 Screnshot.takeScreenshot(driver, "D:\\TravelMint\\Tranding.png");
		   
	}

}
