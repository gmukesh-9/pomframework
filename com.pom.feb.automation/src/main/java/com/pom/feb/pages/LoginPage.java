package com.pom.feb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
		By Uname = By.id("userName");
		By Pwd = By.id("password");
		By LoginBtn = By.id("login");
		By InvalidUname = By.xpath("//input[@class='mr-sm-2 is-invalid form-control' and @id='userName']");
		By InvalidPwd = By.xpath("//input[@class='mr-sm-2 is-invalid form-control' and @id='password']");
		
		public void enterUname(String UserId) {
			type(Uname,UserId);
		}
		
		public void enterPwd(String Password) {
			type(Pwd,Password);
		}
		
		public DashboardPage LoginBtn() {
			click(LoginBtn);
			return new DashboardPage(driver);
		}
}
