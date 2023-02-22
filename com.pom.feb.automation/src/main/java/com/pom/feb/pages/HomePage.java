package com.pom.feb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	By LoginBtn = By.id("login");

	public LoginPage ClickHomeLogin() {
		click(LoginBtn);
		return new LoginPage(driver);
	}
	
}
