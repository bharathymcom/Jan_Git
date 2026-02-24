package locators.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.cucum.BaseClassCucum;

public class SearchLocatorsClass extends BaseClassCucum {

	public SearchLocatorsClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private static WebElement search;
	
	@FindBy(xpath="(//a[@title='Login'])[1]")
    private static WebElement loginbutton;
	
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input")
	private static WebElement username;
	
	
	public static WebElement getSearch() {
		return search;
	}

	public static WebElement getGlobalsearch() {
		return globalsearch;
	}

	
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement globalsearch;

	public static WebElement getLoginbutton() {
		return loginbutton;
	}

	public static WebElement getUsername() {
		return username;
	}

	}


