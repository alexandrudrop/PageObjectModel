package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class BlogTests extends BaseTest{
	
	
	@Test(priority=1)
	public void blogTest() {
		
		app.click(app.menuTema.blogCategoryList);
		app.click(app.menuTema.classicCategory);
		
		app.sendKeys(app.blog.searchBlogField, "why");
		app.click(app.blog.searchBlogBtn);
		app.click(app.blog.readMore);
		
		assertEquals(app.blog.checkCategoryClassicText(app.blog.categoryClassic), "Classic");
		assertEquals(app.blog.checkCategoryNewsText(app.blog.categoryNews), "News");
		assertEquals(app.blog.checkCategoryRecommendText(app.blog.categoryRecommend), "Recommend");
	}
	
	@Test(priority=2)
	public void shopTest() {
		
		app.click(app.menu.shopLink);
	}
}