package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import page.LoginPage;
import utils.UtilKit;

public class ValidateLoginUsingPOMandDataProvider extends BaseTest {
	@Test(dataProvider = "getData")
	public void validateLoginTest(HashMap<String, String>dataMap)
	{
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.username_textbox(dataMap.get("username"));
		lp.password_textbox(dataMap.get("password"));
		lp.login_button();
		lp.verifyTitle(dataMap.get("Expected Title"));
	}
	@DataProvider()
	public Object[][] getData(){
		Object[] []data=new Object[1][1];
		data[0][0]=UtilKit.getTestDataFromExcel("TC-100");
		return data;
		
	}

}
