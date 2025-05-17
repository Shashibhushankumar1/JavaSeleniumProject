package com.synchronization;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartCheckoutWaits {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		// it implicitlyWait will apply global lebel
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Below Explicit Wait it will target partiuclar scanrio so Performance will fast
    	WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver,itemsNeeded);
		//<img class=" " src="https://rahulshettyacademy.com/seleniumPractise/images/bag.png" alt="Cart"> Below cssSel
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//  <button type="button" class=" ">PROCEED TO CHECKOUT</button> Bellow locater
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		//<input type="text" class="promoCode" placeholder="Enter promo code"> Below locater
	//Here Using Explicit wait beacuse page is changing so taking time shift one page to another page.
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		//<button class="promoBtn">Apply</button>
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		//explicit wait
		//<span class="promoInfo" style="color: green;">Code applied ..!</span>
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		}
		public static  void addItems(WebDriver driver,String[] itemsNeeded)
		{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();
		//format it to get actual vegetable name
		//convert array into array list for easy search
		//  check whether name you extracted is present in arrayList or not-
		List itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName))

		{
		j++;

		//click on Add to cart
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)

		{
		break;
		}
		}
		}
		}
}
