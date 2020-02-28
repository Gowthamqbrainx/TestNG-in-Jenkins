package qbrainx.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinLogin extends UtilityClass {
	Locators log;
	
	@BeforeClass
	private void browserLaunch() {
		launchBrowser();
	}

	@BeforeMethod
	private void startTime() {
		Time();
	}

	@Test
	private void validtestCase() {
		log = new Locators();
		url("https://adactin.com/HotelApp/");
		driver.findElement(By.id("username")).sendKeys("GOWTHAMK");
		driver.findElement(By.id("password")).sendKeys("Myvizhi@1194");
		driver.findElement(By.id("username")).click();
	}

	/* @Test
	private void inValidtestCaseOne() {
		log  = new Locators();
		url("https://adactin.com/HotelApp/");
		fill(log .getUser(), "Apple");
		fill(log .getPass(), "One@1");
		btnclk(log .getLogin());
	}

	@Test
	private void inValidtestCaseTwo() {
		locater = new Locators();
		url("https://adactin.com/HotelApp/");
		fill(locater.getUser(), "Orange");
		fill(locater.getPassword(), "Two@2");
		btnclk(locater.getLogin());
	}

	@Test
	private void inValidtestCaseThree() {
		locater = new Locators();
		url("https://adactin.com/HotelApp/");
		fill(locater.getUser(), "Mango");
		fill(locater.getPassword(), "Three@3");
		btnclk(locater.getLogin());
	}
*/
	@AfterMethod
	private void endTime() {
		Time();
	}

	@AfterClass
	private void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}
}
