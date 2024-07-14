package testscripts.regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;
import utils.UtilKit;

public class ValidateLoginUsingHybridFrameWork extends BaseTest {
	@Test(dataProvider = "getData")
	public void work(HashMap<String, String> dataMap) {
		ApplicationKeywords ap=new ApplicationKeywords();
		ap.openBrowser();
		ap.launchApp();
		ap.type("username_textbox", dataMap.get("username"));
		ap.type("password_textbox", dataMap.get("password"));
		ap.click("login_button");
		ap.validateTitle(dataMap.get("Expected Title"));
		ap.closeBrowser();
	}
		

		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[1][1];
			
			data[0][0]=UtilKit.getTestDataFromExcel("TC-100");
			
			return data;
			
		}
	


}
