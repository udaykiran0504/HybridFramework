package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//WebElements
	@FindBy(xpath="//input[@name='username']")
	WebElement username_textbox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password_textbox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement login_button;
	
	//Action on WebElements
	
	public void username_textbox(String Text) {
		type(username_textbox, Text);
		
	}
	public void password_textbox(String Text) {
		type(password_textbox, Text);
	}
	public void login_button() {
		click(login_button);
	}
	
	

}
