package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BasePage {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstNameTextBox;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastNameTextBox;
	@FindBy(xpath="//textarea[@name='address']")
	WebElement addressTextBox;
	@FindBy(xpath="//textarea[@name='cc_num']")
	WebElement creditCardTextBox;
	@FindBy(xpath="//select[@name='cc_type']")
	WebElement creditCardType;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	WebElement cardExpMonth;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	WebElement cardExpYear;
	@FindBy(xpath="//select[@name='cc_cvv']")
	WebElement cardCvv;
	@FindBy(xpath="//input[@id='book_now']")
	WebElement bookNowButton;
	
	public void firstNameTextBox(String Text) {
		type(firstNameTextBox, Text);
	}
	public void lastNameTextBox(String Text) {
		type(lastNameTextBox, Text);
	}
	public void addressTextBox(String Text) {
		type(addressTextBox, Text);
	}
	public void creditCardTextBox(String Text) {
		type(creditCardTextBox, Text);
	}
	public void creditCardType(String Text) {
		selectFromDropDown(creditCardType, Text);
	}
	public void cardExpMonth(String Text) {
		selectFromDropDown(cardExpMonth, Text);
	}
	public void cardExpYear(String Text) {
		selectFromDropDown(cardExpYear, Text);
	}
	public void cardCvv(String Text) {
		type(cardCvv, Text);
	}
	public void bookNowButton() {
		click(bookNowButton);
	}

}
