package ui.steps;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObject;

public class LaunchGoogle extends PageObject {
	
	@Given("Open google search page")
	public void open_google_search_page() {
	    getDriver().get("https://google.com");
	}
}
