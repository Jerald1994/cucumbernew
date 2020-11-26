package org.step;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass{
	WebDriver driver;
	@Given("User is on the adactin page'")
	public void user_is_on_the_adactin_page() {
	 
	   driver.get("http://adactinhotelapp.com/");
	   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
	    WebElement userName = driver.findElement(By.id("username"));
	    userName.sendKeys(string);
	    
	    
	    WebElement passWord = driver.findElement(By.id("password"));
	    passWord.sendKeys(string2);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	    WebElement btnlogin = driver.findElement(By.id("login"));
	    btnlogin.click();
	}

	@Then("User should verify the msg'")
	public void user_should_verify_the_msg() {
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("verifying the message", url.contains("SearchHotel"));
	}

	@When("user entered in search hotel page should select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_entered_in_search_hotel_page_should_select(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    WebElement location = driver.findElement(By.id("location"));
	    Select s = new Select(location);
	    s.selectByVisibleText(string);
	    
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    Select s1 = new Select(hotel);
	    s1.selectByVisibleText(string2);
	    
	    WebElement room = driver.findElement(By.id("room_type"));
	    Select s3 = new Select(room);
	    s3.selectByVisibleText(string3);
	    
	    WebElement roomNo = driver.findElement(By.id("room_nos"));
	    Select s4 = new Select(roomNo);
	    s4.selectByVisibleText(string4);
	    
	    WebElement dateIn = driver.findElement(By.id("datepick_in"));
	    dateIn.sendKeys(string5);
	    
	    WebElement dateOut = driver.findElement(By.id("datepick_out"));
	    dateOut.sendKeys(string6);
	    
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    Select s7 = new Select(adult);
	    s7.selectByVisibleText(string7);
	    
	    WebElement child = driver.findElement(By.id("child_room"));
	    Select s8 = new Select(child);
	    s8.selectByVisibleText(string8);
	}

	@When("user should click the search button")
	public void user_should_click_the_search_button() {
		WebElement click = driver.findElement(By.id("Submit"));
		click.click();
		
	}

	@When("user entered into search hotel page")
	public void user_entered_into_search_hotel_page() {
	   String currentUrl = driver.getCurrentUrl();
	  Assert.assertTrue("verifying the url", currentUrl.contains("SelectHotel"));
	}

	@When("user entered hotel page click the radio button")
	public void user_entered_hotel_page_click_the_radio_button() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
	   
	}

	@When("click continue button")
	public void click_continue_button() {
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
	    
	}

	@Then("user entered in book a hotel page")
	public void user_entered_in_book_a_hotel_page() {
	    String urll = driver.getCurrentUrl();
	    Assert.assertTrue("display", urll.contains("BookHotel"));
	}

	@When("user  should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  WebElement firstName = driver.findElement(By.id("first_name"));
	  firstName.sendKeys(string);
	  
	  WebElement lastNames2 = driver.findElement(By.id("last_name"));
	  lastNames2.sendKeys(string2);
	  
	  WebElement adresss3 = driver.findElement(By.id("address"));
	  adresss3.sendKeys(string3);
	  
	  WebElement cards4 = driver.findElement(By.id("cc_num"));
	  cards4.sendKeys(string4);
	  
	  WebElement cardTypes5 = driver.findElement(By.id("cc_type"));
	  Select s5 = new Select(cardTypes5);
	  s5.selectByVisibleText(string5);
	  
	  WebElement expire = driver.findElement(By.id("cc_exp_month"));
	  Select s6 = new Select(expire);
	  s6.selectByVisibleText(string6);
	  
	  WebElement year = driver.findElement(By.id("cc_exp_year"));
	  Select s7 = new Select(year);
	  s7.selectByVisibleText(string7);
	  
	  WebElement num = driver.findElement(By.id("cc_cvv"));
	  num.sendKeys(string8);
	  
	  
	}

	@When("click the book now button")
	public void click_the_book_now_button() {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	    
	}

	@Then("user entered into conformation page get the order no")
	public void user_entered_into_conformation_page_get_the_order_no() {
		WebElement ord = driver.findElement(By.id("order_no"));
		String val = ord.getAttribute("value");
		System.out.println(val);
	    
	}

}
