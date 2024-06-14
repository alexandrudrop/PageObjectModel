package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest{
	
	@Test
	public void example1() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//alternativa pentru Click()
		//jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
		
		//alternativa pentru sendKeys()
		//jse.executeScript("arguments[0].value='Storm'", app.getWebElement(app.menu.searchInput));
		
		/*jse.executeScript("arguments[0].click();"
				+ "arguments[1].value='Storm';"
				+ "arguments[0].click();",
		app.getWebElement(app.menu.searchIcon),
		app.getWebElement(app.menu.searchInput));
		*/
		
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click();"
				+"document.getElementsByClassName('search_field')[0].value='cooking';"
				+"document.getElementsByClassName('icon-search')[0].click();");
	}
	

}
