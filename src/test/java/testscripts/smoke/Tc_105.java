package testscripts.smoke;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import io.opentelemetry.api.internal.Utils;
import page.LoginPage;
import page.SearchHotelPage;
import page.SelectHotelPage;
import utils.UtilKit;

public class Tc_105 extends BaseTest {
	@Test(dataProvider="getData")
	public void checkInDateChange(HashMap<String, String>dataMap) {
		LoginPage lp=new LoginPage();
		lp.username_textbox(dataMap.get("username"));
		lp.password_textbox(dataMap.get("password"));
		lp.login_button();
		SearchHotelPage shp=new SearchHotelPage();
		shp.verifyTitle(dataMap.get("Expected Title1"));
		shp.welcomeMenuText(dataMap.get("welcome text"));
		shp.locationDropDown(dataMap.get("Location"));
		shp.hotelDropDown(dataMap.get("Hotels"));
		shp.roomTypeDropDown(dataMap.get("Room Type"));
		shp.checkInDate(dataMap.get("Check In Date"));
		shp.checkOutDate(dataMap.get("Check Out Date"));
		shp.AdultPerRooms(dataMap.get("Adults per Room"));
		shp.childPerRoom(dataMap.get("Children per Room"));
		shp.searchButton();
		SelectHotelPage shhp=new SelectHotelPage();
		shhp.verifyTitle(dataMap.get("Expected Title2"));
		shhp.verifyHotelName(dataMap.get("Expected Hotel"));
		shhp.verifyCheckInData(dataMap.get("Expected Check In Date"));
		shhp.verifyCheckOutDate(dataMap.get("Expected Check Out Date"));

	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[1][1];
		data [0][0]=UtilKit.getTestDataFromExcel("TC-105");
		return data;
	}

}
