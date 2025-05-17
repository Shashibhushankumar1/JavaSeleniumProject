package com.funtionaltesting;

import java.util.Arrays;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMultipuleItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{
		// j=0
		int j = 0;
		// Below code will store all products by helping h4.product-name
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			// Below code will give product name

			String[] name = products.get(i).getText().split("-");
			// split("-")Split into two parts 0-index Brocolli , 1st index-1 Kg

			// Brocolli - 1 Kg Kg format trim after -
			String formattedName = name[0].trim();
			// trim() will remove sapces

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);
			// Here all text items will check with name of that is present in it
			// itemsNeededList
			if (itemsNeededList.contains(formattedName))

			{
				j++;
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// Below code j is equal to the length of array of products that much will
				// excute then will break when equal
				if (j == itemsNeeded.length)

				{
					break;
				}
			}
		}
	}

}
