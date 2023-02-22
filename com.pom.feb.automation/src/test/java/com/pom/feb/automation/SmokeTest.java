package com.pom.feb.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.feb.drivers.DriverManager;
import com.feb.drivers.DriverManagerFactory;
import com.feb.drivers.DriverTypes;
import com.pom.feb.pages.DashboardPage;
import com.pom.feb.pages.HomePage;
import com.pom.feb.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTest {
	
	WebDriver driver;
  	//LoginPage login = new LoginPage(driver);
  	//DashboardPage dashboard = new DashboardPage(driver);
	DriverManager driverManager;
	
	@BeforeTest
	
	public void startup() {
		driverManager = DriverManagerFactory.getManager(DriverTypes.CHROME);
		//WebDriverManager.chromedriver().setup();
		driver = driverManager.getDriver();
		driver.navigate().to("https://demoqa.com/books");
		driver.manage().window().maximize();
		}
	
	@AfterTest
	
	public void afterTest() {
		driver.quit();
	}
	
  @Test
  	public void Login() throws InterruptedException {
		HomePage home = new HomePage(driver);
		LoginPage login = home.ClickHomeLogin();
	  	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 10000)");
	  	login.enterUname("govindb");
	  	login.enterPwd("Bluesky@9");
	  	DashboardPage dashboard = login.LoginBtn();
	  	Thread.sleep(2000);
	  	dashboard.Heading();
	  	dashboard.Logout();
  	}
}
