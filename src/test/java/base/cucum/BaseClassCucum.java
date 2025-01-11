package base.cucum;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
// testchange
public class BaseClassCucum {
		public static WebDriver driver =null;
		
		public static void browserlaunch(String url) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
			public static void inputText(WebElement elementref ,String data) {
				elementref.sendKeys(data);
				
				
			}
			public static void buttonClick(WebElement element) {
				element.click();
			}
			public static void window_parent() {
				Set<String> windowHandles = driver.getWindowHandles();
				List<String>multiwindows=new ArrayList<String>(windowHandles);
				System.out.println(multiwindows.size());
				String parentWindow = multiwindows.get(0);
				//String childWindow = multiwindows.get(1);
				driver.switchTo().window(parentWindow);
			}
				public static void window_child() {
					Set<String> windowHandles = driver.getWindowHandles();
					List<String>multiwindows=new ArrayList<String>(windowHandles);
					System.out.println(multiwindows.size());
					String parentWindow = multiwindows.get(0);
					String childWindow = multiwindows.get(1);
					driver.switchTo().window(childWindow);
				}
				


			}
			
		
		
		
		

