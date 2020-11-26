package AnotherStep;

import java.util.List;
import java.util.Map;

import org.classes.BaseClass;
import org.simplemodifiedpojo.EnterOtherDetails;
import org.simplemodifiedpojo.HomePage;
import org.simplemodifiedpojo.SelectHotel;
import org.simplemodifiedpojo.SelectLocation;
import org.simplemodifiedpojo.orderNo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewStep extends BaseClass {
	
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

	@When("User should select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    SelectLocation sl = new SelectLocation();
	    sl.details(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@Then("User should select the Hotel and continue")
	public void user_should_select_the_Hotel_and_continue() {
	    SelectHotel sh = new SelectHotel();
	    sh.yourHotel();
	}

	
	
	@Then("user should enter {string},{string},{string}")
	public void user_should_enter(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		EnterOtherDetails eo = new EnterOtherDetails();
		List<Map<String, String>> mam = dataTable.asMaps();
		Map<String, String> mm = mam.get(2);
		String string4 = mm.get("ccNo");
		String string5 = mm.get("ccType");
		String string6 = mm.get("expiryMonth");
		String string7 = mm.get("expiryYear");
		String string8 = mm.get("cvvNo");
		eo.information(string, string2, string3, string4, string5, string6, string7, string8);
		System.out.println("print value" + string4+string5+string6+string7+string8);
	}


	@Then("User should book the hotel and get the confirmation Order ID")
	public void user_should_book_the_hotel_and_get_the_confirmation_Order_ID() {
	    orderNo o = new orderNo();
	    o.printOrder();
	}


}
