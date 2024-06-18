package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest{
	
	@Test(priority=1)
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
	
	// alternativa pentru isDisplayed()
		
		String visible = jse.executeScript
				("return document.getElementsByClassName('post_title')[0].childNodes[0].checkVisibility()").toString();
		System.out.println(visible);
		
		assertEquals(visible, "true");
		
		boolean isVisible = Boolean.parseBoolean(visible);
		assertTrue(isVisible);
		
	// alternativa pentru getText()
		
		String bookTitle =jse.executeScript
				("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText").toString();	
				System.out.println(bookTitle);
				jse.executeScript("document.getElementsByClassName('post_title')[0].childNodes[0].click()");
		
	// alternativa pentru getCurrentUrl()
		
		String currentUrl = jse.executeScript("return document.URL").toString();
		System.out.println(currentUrl);
	
	// alternativa pentru getTitle()
		
		String currentPageTitle = jse.executeScript("return document.title").toString();
		System.out.println(currentPageTitle);
		
		jse.executeScript("window.scrollBy(0, 900)");
		jse.executeScript("document.getElementById('tab-title-reviews').children[0].click() ");
		
	// alternativa pentru isSelected()
		
		String isSelected = jse.executeScript
		("return document.getElementById('wp-comment-cookies-consent').checked").toString();
		System.out.println(isSelected);
		
	// alternativa pentru isEnabled()
		
		String isEnabled = jse.executeScript
		("return document.getElementById('author').disabled").toString();
		System.out.println(isEnabled);
	}
	
	@Test(priority=2)
	public void example2() {
		
		String alertaJs = "window.obj = function() {}";
		
	}
}