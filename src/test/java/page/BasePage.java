package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest {
	public void verifyTitle(String expTitle) {
		Assert.assertEquals(driver.getTitle(),expTitle );
		test.info("Asseration passed...");
	}
	
	public void verifyText(WebElement element,String verifyText) {
		Assert.assertEquals(element.getText(),verifyText );
		test.info("Text Verified.. both are same...");
	}
	public void verifySelectDetails(WebElement element,String verifyText) {
		Assert.assertEquals(element.getAttribute("value"),verifyText );
		test.info("Text Verified.. both are same...");
	}
	public void type(WebElement element,String Text) {
		element.sendKeys(Text);
		test.info("Entered text"+Text+"into textbox"+element);
	}
	public void click(WebElement element ) {
		element.click();
		test.info("Clicked the element text"+element);
	}
	public void clear(WebElement element) {
		element.clear();
		test.info("Cleared the element text"+element);
	}
	public void selectFromDropDown(WebElement element,String option) {
		new Select(element).selectByVisibleText(option);
		test.info("Selected option "+option+"from dropdown"+element);
	}
	public static String screenShot() {
		String screenShotFolderPath=System.getProperty("user.dir")+"\\Screenshots";
		File screenShotsFolder=new File(screenShotFolderPath);
		screenShotsFolder.mkdir();
		Date d=new Date();
		String pattern="YYYY-MM-DD HH-mm-ss";
		SimpleDateFormat value=new SimpleDateFormat(pattern);
		String date =value.format(d);
		System.out.println(date);
		String screenShortFilePath=screenShotFolderPath+"\\"+date+" .png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(screenShortFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return screenShortFilePath;
		
	}

}
