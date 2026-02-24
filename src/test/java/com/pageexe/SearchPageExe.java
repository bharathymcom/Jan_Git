package com.pageexe;



import base.cucum.BaseClassCucum;
import locators.com.CartLLocators;
import locators.com.SearchLocatorsClass;

public class SearchPageExe extends CartLLocators{
	public static void searchBox() {
		BaseClassCucum.inputText(new SearchLocatorsClass().getSearch(),"Iphone 16 pro");
	}
	public static void searchclick() {
	    BaseClassCucum.buttonClick(getGlobalsearch());
	}
	

}
