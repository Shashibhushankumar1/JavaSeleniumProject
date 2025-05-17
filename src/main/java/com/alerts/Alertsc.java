package com.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsc {
	public static void main(String[] args) {
		String text = "Rahul";

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
//Switch browser driver to alert pop-up (then selenium check any alert)
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
// Here accept() will click on Ok on alert pop-up
		driver.findElement(By.id("confirmbtn")).click();
//Below will capture text written on alert
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

	}
}
