package org.simplemodifiedpojo;

import org.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLocation extends BaseClass {
	
	public SelectLocation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id = "hotels")
private WebElement hotl;
	
	@FindBy(id ="room_type")
	private WebElement room;
	
	@FindBy(id ="room_nos")
	private WebElement roomnos;
	
	@FindBy(id ="datepick_in")
	private WebElement datein;
	
	@FindBy(id ="datepick_out")
	private WebElement dateout;
	
	@FindBy(id ="adult_room")
	private WebElement adult;
	
	@FindBy(id ="child_room")
	private WebElement child;
	
	@FindBy(id= "Submit")
	private WebElement submits;

	public WebElement getSubmits() {
		return submits;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotl() {
		return hotl;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	
	public void details(String location, String hotel,String string3, String string4, String string5, String string6, String string7, String string8) {
		selectByVisibletext(getLoc(), location);
		selectByVisibletext(getHotl(), hotel);
		selectByVisibletext(getRoom(), string3);
		selectByVisibletext(getRoomnos(), string4);
		sendkeys(getDatein(), string5);
		sendkeys(getDateout(), string6);
		selectByVisibletext(getAdult(), string7);
		selectByVisibletext(getChild(), string8);
		buttonClick(getSubmits());
	}
	
	
}
