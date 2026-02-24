package com.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.cucum.BaseClassCucum;
import io.github.bonigarcia.wdm.WebDriverManager;

public class main extends BaseClassCucum {
	public static WebDriver driver =null;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
searchbox.sendKeys("Iphone 16 pro");
searchbox.submit();
//WebElement selectmobile = driver.findElement(By.xpath("//a[@title='Apple iPhone 16 Pro Max (Natural Titanium, 512 GB)']"));
//selectmobile.click();
WebElement select = driver.findElement(By.xpath("(//div[text()='₹1,57,900'])[1]"));
select.click();

//Set<String> windowHandles = driver.getWindowHandles();
//List<String>multiwindows=new ArrayList<String>(windowHandles);
//System.out.println(multiwindows.size());
//String parentWindow = multiwindows.get(0);
//String childWindow = multiwindows.get(1);
//driver.switchTo().window(childWindow);
BaseClassCucum.window_child();
//System.out.println(driver.getTitle());
WebElement addToCart = driver.findElement(By.xpath("//button[normalize-space(text())='Add to cart']"));
addToCart.click();
//JavascriptExecutor js =(JavascriptExecutor)driver;
//js.executeScript("arguments[0].click()", addToCart);
}

}

