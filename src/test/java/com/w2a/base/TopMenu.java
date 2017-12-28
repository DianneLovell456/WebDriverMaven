package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	public WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void goToHome() {

	}

	public void goToFeeds() {

	}

	public void goToLeads() {

	}

	public AccountsPage goToAccounts() {
		Page.click("accountsTab_CSS");
		return new AccountsPage();
	}

	public void goToContacts() {

	}

	public void signOut() {
		
	}
}
