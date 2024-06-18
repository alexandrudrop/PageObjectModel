package tests.tema;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class AudioPostsTests extends BaseTest{
	
	@Test
	public void audioPostsTest() throws InterruptedException {
		
		app.click(app.menuTema.blogCategoryList);
		app.click(app.menuTema.postFormatsCategory);
		app.click(app.blog.audioPost);
		app.click(app.audioPost.musicPlayPauseBtn);
		app.click(app.audioPost.musicPlayPauseBtn);
		Thread.sleep(1000);
		app.hoverElement(app.audioPost.musicTimeSliderInitialPosition);
		app.dragAndDrop(app.audioPost.musicTimeSliderInitialPosition, 200, 0);
		app.hoverElement(app.audioPost.musicVolumeSliderInitialPosition);
		app.dragAndDrop(app.audioPost.musicVolumeSliderInitialPosition, 50, 0);
		
	}

}
