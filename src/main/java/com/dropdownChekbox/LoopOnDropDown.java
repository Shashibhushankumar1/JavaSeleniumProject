package com.dropdownChekbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopOnDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivraj\\Documents\\all-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		i++;

		}*/

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		   for(int i=1;i<5;i++)

		   {
// + (Button Add More) 
		   driver.findElement(By.id("hrefIncAdt")).click();

		   }
//Done Button
		   driver.findElement(By.id("btnclosepaxoption")).click();

//		   Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
