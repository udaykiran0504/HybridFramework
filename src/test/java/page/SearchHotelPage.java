package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BasePage{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='welcome_menu']")
	WebElement welcomeMenuText;
	
	@FindBy(xpath="//select[@name='location']")
	WebElement locationDropDown;
	
	@FindBy(xpath="//select[@name='hotels']")
	WebElement hotelDropDown;
	
	@FindBy(xpath="//select[@name='room_type']")
	WebElement roomTypeDropDown;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	WebElement checkInDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	WebElement checkOutDate;
	
	@FindBy(xpath="//select[@name='adult_room']")
	WebElement AdultPerRooms;
	
	@FindBy(xpath="//select[@name='child_room']")
	WebElement childPerRoom;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement searchButton;
	
	@FindBy(xpath="//span[@id='checkin_span']")
	WebElement alertCheckIn;
	
	@FindBy(xpath="//span[@id='checkout_span']")
	WebElement alertCheckOut;
	
	public void welcomeMenuText(String Text) {
		verifyText(welcomeMenuText, Text);
	}
	public void locationDropDown(String option) {
		selectFromDropDown(locationDropDown, option);
	}
	public void hotelDropDown(String option) {
		selectFromDropDown(hotelDropDown, option);
	}
	public void roomTypeDropDown(String option) {
		selectFromDropDown(roomTypeDropDown, option);
	}
	public void checkInDate(String date) {
		clear(checkInDate);
		type(checkInDate, date);
	}
	public void checkOutDate(String date) {
		clear(checkOutDate);
		type(checkOutDate, date);
	}
	public void AdultPerRooms(String option) {
		selectFromDropDown(AdultPerRooms, option);
	}
	public void childPerRoom(String option) {
		selectFromDropDown(childPerRoom, option);
	}
	public void searchButton() {
		click(searchButton);
	}
	public void alertCheckIn(String Text) {
		verifyText(alertCheckIn, Text);
	}
	public void alertCheckOut(String Text) {
		verifyText(alertCheckOut, Text);
	}

}
