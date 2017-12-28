package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZooAppPage extends Page{
		
	public void goToBooks() {
		driver.findElement(By.xpath(".//*[@id='zl-category-1']/div/ul/li[4]/div/a/p")).click();
	}
	
	public CRMHomePage goToCrm() {
		
		click("crmLink_CSS");
		
		return new CRMHomePage();
		
	}
	
	public void goToSalesIQ() {
		driver.findElement(By.xpath(".//*[@id='zl-category-2']/div/ul/li[6]/div/a/p")).click();
	}

}
