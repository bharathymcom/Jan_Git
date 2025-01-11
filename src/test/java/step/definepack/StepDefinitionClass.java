package step.definepack;

import com.pageexe.AddCarPageExe;

import base.cucum.BaseClassCucum;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends AddCarPageExe{
	@Given("Enter the URL")
	public void enter_the_url() {
		BaseClassCucum.browserlaunch("https://www.flipkart.com/");
		System.out.println( "browserlaunch");
	}

	

	@When("Search the iphone in the global search box")
	public void search_the_iphone_in_the_global_search_box() {
		searchBox();
		searchclick();
		System.out.println("search");
	}

	@When("Select the iphone and placed into card")
	public void select_the_iphone_and_placed_into_card() {
		AddCarPageExe.nextnewphone();
		BaseClassCucum.window_child();
		driver.navigate().refresh();
		addCart();
		System.out.println("add to card");
		
	}

	@Then("Verify the cart and close the browser")
	public void verify_the_cart_and_close_the_browser() {
		driver.quit();
		System.out.println("close");
	}
}



