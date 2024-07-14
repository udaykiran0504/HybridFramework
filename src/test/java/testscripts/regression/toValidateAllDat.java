package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class toValidateAllDat extends BaseTest {
	@Test(dataProvider = "getData")
	public void toVerifyValidLoginDetailsTest(String un,String pwd,String expTit) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), expTit);
	} 
	@DataProvider
	public Object[] []getData(){
		Object[] [] data= new Object[4][3];
		data[0][0]="udaykiran7013 ";
		data[0][1]="NR069R";
		data[0][2]="Adactin.com - Search Hotel";
		
		data[1][0]="udaykiran7013 ";
		data[1][1]="udaykiran";
		data[1][2]="Adactin.com - Hotel Reservation System";
		
		data[2][0]="udaykiran9133";
		data[2][1]="NR069R";
		data[2][2]="Adactin.com - Hotel Reservation System";
		
		data[3][0]="udaykiran9133";
		data[3][1]="udaykiran";
		data[3][2]="Adactin.com - Hotel Reservation System";
		return data;
	}

}
