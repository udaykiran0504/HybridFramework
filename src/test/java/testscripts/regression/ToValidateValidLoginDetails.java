package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ToValidateValidLoginDetails extends BaseTest {

	@Test
	public void toVerifyValidLoginDetailsTest() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("udaykiran7013 ");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("NR069R");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
	} 
	@Test
	public void toVerifyValidUserNameInvalidPassword() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("udaykiran7013 ");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udaykiran");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	} 
	@Test
	public void toVerifyInValidUserNameValidPassword() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("udaykiran9133");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("NR069R");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	} 
	@Test
	public void toVerifyInValidUserNameInValidPassword() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("udaykiran9133");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("udaykiran");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	}


}
