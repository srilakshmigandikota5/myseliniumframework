 package com.mvnseliniumproj.mvnseliniumproj;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	@FindBy(id = "Email")
	WebElement emailId;
	
	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement login;
	
	@FindBy(linkText = "Log out")
	WebElement logout;
	
	public LoginPagePF(WebDriver driv){
		PageFactory.initElements(driv, this); // this-> current class instance
	}
	
	public void loginToApplication() {
		emailId.sendKeys("sri123@gmail.com");
		password.sendKeys("123456");
		login.click();
	}
	
	public void logoutFromApplication() {
		logout.click();
	}
	
}
