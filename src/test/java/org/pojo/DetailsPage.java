package org.pojo;

import org.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends BaseClass{
	
	public DetailsPage() {
		PageFactory.initElements(driver, this);
		}
    @FindBy (id = "location")
    private WebElement locatio;
    
    @FindBy (id = "hotels")
    private WebElement hotel;
    
    @FindBy (id = "room_type")
    private WebElement room;
    
    @FindBy (id = "room_nos")
    private WebElement roomnos;
    
    @FindBy (id = "datepick_in")
    private WebElement indate;
    
    @FindBy (id = "datepick_out")
    private WebElement outdate;
    
    @FindBy (id = "adult_room")
    private WebElement adult;
    
    @FindBy (id = "child_room")
    private WebElement child;
    
    @FindBy (id = "Submit")
    private WebElement search;

	public WebElement getLocatio() {
		return locatio;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
}
