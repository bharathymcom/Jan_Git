package com.pageexe;

import org.openqa.selenium.support.PageFactory;

import base.cucum.BaseClassCucum;
import locators.com.SelectLocatClass;

public class SelectPageexe extends SearchPageExe{
	
	public static void nextnewphone() {
		BaseClassCucum.buttonClick(new SelectLocatClass().getNextPhone());
	}
}
