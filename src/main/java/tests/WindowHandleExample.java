package tests;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class WindowHandleExample extends BaseTest{
	
	@Test
	public void windowHandleExample() {
		
		driver.get("https://keybooks.ro/event/seminar-of-modern-art/");
		
		app.scrollVertically(800);
		
		driver.switchTo().frame(app.getWebElement(app.genericEvent.mapFrame));
		app.click(app.genericEvent.viewLargerMapLink);
		
	}

}
