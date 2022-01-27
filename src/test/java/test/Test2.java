package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import page.Test2Page;
import util.BrowserFactory;

public class Test2 {

WebDriver driver;
	
	@Test
	public void verifyingExistingCategory() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test2Page t2 = PageFactory.initElements(driver, Test2Page.class);
		
		
		
		t2.addingCategoryItem();
		t2.clickingAddCategoryButton();
		
		Thread.sleep(2000);

		
		t2.verifyExistingCategory();
		

		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
	
	
}
