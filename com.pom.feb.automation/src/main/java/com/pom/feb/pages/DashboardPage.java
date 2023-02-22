package com.pom.feb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
		By Header = By.xpath("//div[text()='Book Store']");
		By LogoutBtn = By.id("submit");
		
				
		/*public String getHeader( ) {
			String Heading = find(Header).getText();
			return Heading;
		} */
		
		public boolean Heading() {
			return isDisplayed(Header);
			
		}
	
		public void Logout() {
			click(LogoutBtn);  
		}
}
