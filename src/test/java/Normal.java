import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Normal {
	public static WebDriver driver =null;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cheapoair.com/flights/booknow/cheap-flight-tickets?fpaffiliate=coa-bing-global&fpsub=&utm_campaign=brand_exact_atlas_global&utm_term=cheap%20airline%20tickets%20cheapoair&utm_term_id=kwd-77103463475418&utm_source=bing&utm_medium={cpc}&device=c&fpprice=&campaignID=376759414&adgroupId=1233652284536200&msclkid=daa48c9a8f041a036b4debe3c0fcaeca&utm_content=price_"
			+ "descriptor%3Dcheap%23product%3Dairline_tickets%23provider%3Dcheapoair");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


 WebElement roundtrip = driver.findElement(By.xpath("//label[text()='Round Trip']"));
	roundtrip.clear();
 //roundtrip.click();
}
}