package com.pageexe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.cucum.BaseClassCucum;
import locators.com.SearchLocatorsClass;

public class exe extends AddCarPageExe{

	public static void main(String[] args) throws Throwable {
		BaseClassCucum.browserlaunch("https://www.flipkart.com/");
	
		 
			FileReader f = new FileReader("C:\\Users\\bhara\\eclipse-workspace"
					+ "\\Cucumber\\src\\test\\resources\\input.json");
	        JSONParser jp = new JSONParser();
	        Object object = jp.parse(f);
	        JSONObject jo = (JSONObject)object;
	        String user = (String)jo.get("username");
         WebElement element = driver.findElement(By.xpath("(//a[@title='Login'])[1]")); 
	     element.click();
	     WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	     element2.sendKeys(user);
	     
		//   SearchLocatorsClass.inputText(getUsername(), "user");
		  // SearchLocatorsClass.buttonClick(getRequestOPT());
		   
		
		
		searchBox();
		searchclick();
		nextnewphone();
		BaseClassCucum.window_child();
		driver.navigate().refresh();
		addCart();
		
		
	}
}
