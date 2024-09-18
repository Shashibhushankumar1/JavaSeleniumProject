package com.dropdownChekbox;


import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivraj\\Documents\\all-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

driver.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000);
// li[class='ui-menu-item'] a   -- Parent Child Css Selector
List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

//Return type of ForEach is WebElement
for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("India"))

{

option.click();

break;

}

}
	}

}
