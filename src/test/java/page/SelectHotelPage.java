package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BasePage {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='hotel_name_0']")
	WebElement verifyHotelName;
	@FindBy(xpath="//input[@id='arr_date_0']")
	WebElement verifyCheckInData;
	@FindBy(xpath="//input[@id='dep_date_0']")
	WebElement verifyCheckOutDate;
	@FindBy(xpath="//input[@id='rooms_0']")
	WebElement verifyNoRooms;
	@FindBy(xpath="//input[@id='room_type_0']")
	WebElement verifyRoomType;
	@FindBy(xpath="//input[@id='price_night_0']")
	WebElement verifyPricePerNight;
	@FindBy(xpath="//input[@id='total_price_0']")
	WebElement verifyTotalPrice;
	@FindBy(xpath="//input[@id='radiobutton_0']")
	WebElement radioButton;
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	public void verifyHotelName(String Text) {
		verifySelectDetails(verifyHotelName, Text);
	}
	public void verifyCheckInData(String Text) {
		verifySelectDetails(verifyCheckInData, Text);
	}
	public void verifyCheckOutDate(String Text) {
		verifySelectDetails(verifyCheckOutDate, Text);
	}
	public void verifyNoRooms(String Text) {
		verifySelectDetails(verifyNoRooms, Text);
	}
	public void verifyPricePerNight(String Text) {
		verifySelectDetails(verifyPricePerNight, Text);
	}
	public void verifyRoomType(String Text) {
		verifySelectDetails(verifyRoomType, Text);
	}
	public void verifyTotalPrice(String Text) {
		verifySelectDetails(verifyTotalPrice, Text);
	}
	public void radioButton() {
		click(radioButton);
	}
	public void continueButton() {
		click(continueButton);
	}

	
	

}
