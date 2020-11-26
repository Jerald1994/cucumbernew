package org.stepdefn;

import java.util.concurrent.TimeUnit;

import org.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.AdactiveHome;
import org.pojo.BookingPage;
import org.pojo.DetailsPage;
import org.pojo.Order;
import org.pojo.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondStep extends BaseClass {
	AdactiveHome a;
	WebDriver driver;
	DetailsPage dp;
	BookingPage bp;

	@Given("User is on the adactin page'")
	public void user_is_on_the_adactin_page() {
		chromeLaunch();
		url("http://adactinhotelapp.com/");

	}

	@When("User should click login after entering {string} and {string}")
	public void user_should_click_login_after_entering_and(String string, String string2) {
		a = new AdactiveHome();

		sendkeys(a.getNam(), string);
		sendkeys(a.getPas(), string2);
		buttonClick(a.getLog());

	}

	@When("User should select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		dp = new DetailsPage();
		selectByVisibletext(dp.getLocatio(), string);
		selectByVisibletext(dp.getHotel(), string2);
		selectByVisibletext(dp.getRoom(), string3);
		selectByVisibletext(dp.getRoomnos(), string4);
		sendkeys(dp.getIndate(), string5);
		sendkeys(dp.getOutdate(), string6);
		selectByVisibletext(dp.getAdult(), string7);
		selectByVisibletext(dp.getChild(), string8);
		buttonClick(dp.getSearch());
	}

	@Then("User should select the Hotel and continue")
	public void user_should_select_the_Hotel_and_continue() {
		SelectHotel sh = new SelectHotel();
		buttonClick(sh.getButton());
		buttonClick(sh.getClick());
	}

	@Then("user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		bp = new BookingPage();
		sendkeys(bp.getName(), string);
		sendkeys(bp.getLast(), string2);
		sendkeys(bp.getAddres(), string3);
		sendkeys(bp.getCardno(), string4);
		selectByVisibletext(bp.getCardType(), string5);
		selectByVisibletext(bp.getMonth(), string6);
		selectByVisibletext(bp.getYear(), string7);
		sendkeys(bp.getCvv(), string8);
		buttonClick(bp.getBook());

	}

	@Then("User should book the hotel and get the confirmation Order ID")
	public void user_should_book_the_hotel_and_get_the_confirmation_Order_ID() {
		Order o = new Order();
		System.out.println(attributeValue(o.getId()));
	}

}
