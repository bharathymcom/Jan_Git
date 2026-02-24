package com.pageexe;

import base.cucum.BaseClassCucum;
import locators.com.CartLLocators;

public class AddCarPageExe extends SelectPageexe {
 public static void addCart(){
	 BaseClassCucum.buttonClick(new CartLLocators().getAddToCart());
 }
}
