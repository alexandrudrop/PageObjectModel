package tests;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class BlogTests extends BaseTest{
	
	
	@Test(priority=1)
	public void blogTest() {
		
		app.click(app.menuTema.blogCategoryList);
		app.click(app.menuTema.classicCategory);
		
	}
}