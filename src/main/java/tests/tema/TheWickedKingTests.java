package tests.tema;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class TheWickedKingTests extends BaseTest{
	
	@Test
	public void searchForTheWickedKing() {
		
		app.click(app.menuTema.searchBtn);
		app.sendKeys(app.menuTema.searchField, "king");
		app.click(app.menuTema.king);
		
		assertEquals(app.wickedKing.checkCategoryFieldText(app.wickedKing.category), "New releases");
		assertEquals(app.wickedKing.checkProductIdFieldText(app.wickedKing.productId), "1709");
		
		app.click(app.wickedKing.productGalleryBtn);
		assertEquals(app.wickedKing.checkTheWickedKingImg1(app.wickedKing.theWickedKingImg1), 
				"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing1.png");
		
		app.click(app.wickedKing.nextArrowBtn);
		assertEquals(app.wickedKing.checkTheWickedKingImg1(app.wickedKing.theWickedKingImg3), 
				"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing3.png");
		
		app.click(app.wickedKing.nextArrowBtn);
		assertEquals(app.wickedKing.checkTheWickedKingImg1(app.wickedKing.theWickedKingImg4), 
				"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing4.png");
		
		app.click(app.wickedKing.nextArrowBtn);
		assertEquals(app.wickedKing.checkTheWickedKingImg1(app.wickedKing.theWickedKingImg2), 
				"https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing2.png");
	}
}
