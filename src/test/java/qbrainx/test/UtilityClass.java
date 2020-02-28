package qbrainx.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	
	 WebDriver driver;

public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Gowtham\\Oxygen workspace\\TestNGforJenkins\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
public void url(String url) {
	driver.get(url);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}

public void fill(WebElement e, String text) {
	e.click();
	e.sendKeys(text);
//	System.out.println(e.getAttribute("value"));
}

public void btnclk(WebElement e) {
	e.click();
}

public void Time() {
	Date time = new Date();
	System.out.println(time);
	}

}
