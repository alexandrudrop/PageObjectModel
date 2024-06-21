package tests.tema;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class JSExecutorTema extends BaseTest{
	
	@Test
	public void addACommentInGalleryFormat() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		String urlToNavigate = "https://keybooks.ro/category/post-formats/";
		jse.executeScript("window.location.href = arguments[0];", urlToNavigate);
		
		
		jse.executeScript("document.getElementsByClassName"
				+ "('post_item post_item_excerpt post_featured_default post_format_gallery odd post-25 "
				+ "post type-post status-publish format-gallery hentry category-post-formats post_format-post-format-gallery')[0]."
				+ "childNodes[1].scrollIntoView(true);");
		
		jse.executeScript("document.getElementsByClassName"
				+ "('post_item post_item_excerpt post_featured_default post_format_gallery odd post-25 "
				+ "post type-post status-publish format-gallery hentry category-post-formats post_format-post-format-gallery')[0]."
				+ "childNodes[1].childNodes[0].click();");	
		
		jse.executeScript("window.scrollBy(0, 3000)");
		
		jse.executeScript("document.getElementsByName('comment')[0].value='sombrero';"
				+"document.getElementsByName('author')[0].value='Gigi';"
				+"document.getElementsByName('email')[0].value='gigi.kent@db.com';"
				+"document.getElementsByName('url')[0].value='https://www.freshful.ro/retete';"
				+"document.getElementsByName('wp-comment-cookies-consent')[0].checked = true;");
		
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByName('submit')[0].click();");

	}
}
