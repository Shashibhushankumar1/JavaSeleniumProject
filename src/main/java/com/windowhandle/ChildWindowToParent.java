package com.windowhandle;

import java.util.Iterator;

import java.util.Set;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class ChildWindowToParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

	//<a href="https://rahulshettyacademy.com/documents-request" class="blinkingText" target="_blank">Free Access to InterviewQues/</a>
		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
// get all window opened getWindowHandles()
		
		Iterator<String>it = windows.iterator();

		String parentId = it.next(); // 0-index will get (So parent window)

		String childId = it.next(); //1-index will get (So child window)
// Switch to child window
		driver.switchTo().window(childId);

		//<p class="im-para red">Please email us at mentor@rahulshettyacademy.com">mentor@rahulshettyacademy.com</a> with 
		//below template to receive response </p>
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();

		// extract this email from text Please email us at mentor@rahulshettyacademy.com
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		//split() into 2 parts 0-index =Please email us 1st-index=mentor@rahulshettyacademy.com 
		//trim() remove sapces so it will before whitespace and after white space

		
		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailId);



	}

}
