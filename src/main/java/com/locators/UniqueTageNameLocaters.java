package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UniqueTageNameLocaters {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	String name = "rahul";

	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");

	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

	driver.findElement(By.className("signInBtn")).click();

Thread.sleep(2000);
System.out.println(driver.findElement(By.tagName("p")).getText());
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
driver.findElement(By.xpath("//*[text()='Log Out']")).click();
driver.close();

	
}
}
