package locators.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartLLocators extends SelectLocatClass {
 public  CartLLocators() {
		PageFactory.initElements(driver, this);
 }
 @FindBy (xpath="//button[normalize-space(text())='Add to cart']")
 private static WebElement addToCart;
public static WebElement getAddToCart() {
	return addToCart;

}
}
