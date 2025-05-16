package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaMethodGetPasswordDynmically {
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.

		String[] passwordArray = passwordText.split("'");
		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]
		
     //Below in one line 
    

      //0th index - Please use temporary password
     //1st index - rahulshettyacademy' to Login.
		  String password = passwordArray[1].split("'")[0];

	      return password;
      //0th index - rahulshettyacademy
      //1st index - to Login.
	}

}
