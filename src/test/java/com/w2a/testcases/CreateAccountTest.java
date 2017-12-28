package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZooAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;
import com.w2a.utilites.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
	
		ZooAppPage zp = new ZooAppPage();
		zp.goToCrm();
		
		AccountsPage account = Page.menu.goToAccounts();
		
		CreateAccountsPage cap = account.goToCreateAccounts();
		cap.createAccount(data.get("accountname"));
	}
	

}
