package com.w2a.pages;




import com.w2a.base.Page;

public class LoginPage extends Page{
	
	public ZooAppPage doLogin(String username, String password) {
		type("email_CSS",username);
		type("password_CSS",password);
		click("signBtn_CSS");
		
		return new ZooAppPage();
	}

	public void goToSalesAndMarketing() {
		
	}
}
