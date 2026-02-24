package locators.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLocatClass extends SearchLocatorsClass{
	public SelectLocatClass() {
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath="(//div[text()='₹1,57,900'])[1]")
private static WebElement nextPhone;
public static WebElement getNextPhone() {
	return nextPhone;
}

}

	


