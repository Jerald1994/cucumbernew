package AnotherStep;

import org.classes.BaseClass;
import org.simplemodifiedpojo.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BgPractice extends BaseClass{
	@Given("User is on the adactin page'")
	public void user_is_on_the_adactin_page() {
	   chromeLaunch();
	   url("http://adactinhotelapp.com/");
	   
	}

	@When("User should click login after entering {string} and {string}")
	public void user_should_click_login_after_entering_and(String string, String string2) {
		 HomePage hp = new HomePage();
		    hp.home(string, string2);
	}
	@When("user should clic login button")
	public void userShouldClicLoginButton() {
		driver.quit();
	    
	}

}
