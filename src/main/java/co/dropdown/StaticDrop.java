package co.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select selectDrop=new Select(staticDropDown);
	selectDrop.selectByIndex(3);
	System.out.println(selectDrop.getFirstSelectedOption().getText());
	//Based upon Selected Text
	selectDrop.selectByVisibleText("AED");
	System.out.println(selectDrop.getFirstSelectedOption().getText());
	selectDrop.selectByValue("INR");
	System.out.println(selectDrop.getFirstSelectedOption().getText());
	
	
}

}
