package com.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultipuleCheckBox {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//<input id="ctl00_mainContent_chk_SeniorCitizenDiscount" type="checkbox" name="ctl00$mainContent$chk_SeniorCitizenDiscount">
	//Regular Expression cssSelector
	
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	//Assert.assertFalse(true);
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

}
}
