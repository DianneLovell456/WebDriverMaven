package com.w2a.rough;


import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZooAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;

public class LoginTest extends Page {

	public static void main(String[] args) {
		System.out.println("In LoginTest");
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		
		ZooAppPage zp = login.doLogin("dianne.lovell@ihsmarkit.com", "Password1");
		zp.goToCrm();
		
		AccountsPage account = Page.menu.goToAccounts();
		
		CreateAccountsPage cap = account.goToCreateAccounts();
		cap.createAccount("Raman");
		
	}

}
