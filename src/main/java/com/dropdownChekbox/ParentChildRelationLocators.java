package com.dropdownChekbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelationLocators {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivraj\\Documents\\all-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// Below Parent xpath // Child Xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

}
}
