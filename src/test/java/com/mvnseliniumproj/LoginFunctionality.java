package com.mvnseliniumproj;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mvnseliniumproj.mvnseliniumproj.BaseTest;
import com.mvnseliniumproj.mvnseliniumproj.LoginPagePF;

public class LoginFunctionality extends BaseTest {
	
	
	@Test
	public void tc02_verifyLoginFunctionality_POM_PF() {
		
		// POM with page factory
		LoginPagePF loginPagePF=new LoginPagePF(driver);
		loginPagePF.loginToApplication();
		loginPagePF.logoutFromApplication();
		
	}
	

		}
	

