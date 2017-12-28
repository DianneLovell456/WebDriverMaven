package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZooAppPage;
import com.w2a.utilites.Utilities;

public class LoginTest extends BaseTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data) {
		System.out.println("In LoginTest");
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		login.doLogin(data.get("username"), data.get("password"));
		
	}
}
