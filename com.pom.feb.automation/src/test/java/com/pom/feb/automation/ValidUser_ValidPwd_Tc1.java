package com.pom.feb.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.feb.pages.DashboardPage;
import com.pom.feb.pages.HomePage;
import com.pom.feb.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidUser_ValidPwd_Tc1 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/books");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		HomePage home = new HomePage(driver);
		LoginPage Login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		
		home.ClickHomeLogin();
		js.executeScript("window.scrollBy(0, 10000)");
		Login.enterUname("govindb");
		Login.enterPwd("Bluesky@9");
		Login.LoginBtn();
		
		Thread.sleep(2000);
		dashboard.Heading();
		dashboard.Logout();
		driver.quit();
		System.out.println("Test Passed");
	}

}
