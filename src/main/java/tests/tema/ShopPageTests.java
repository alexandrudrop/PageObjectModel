package tests.tema;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ShopPageTests extends BaseTest{
	
	@Test
	public void shopPageTest() {
		
		app.click(app.menu.shopLink);
		app.shop.selectByIndex(4);
		assertEquals(app.shop.getSelectedOption(), "Sort by price: low to high");
		assertEquals(app.shop.checkThePriceOfUltimateBookOfRecipes(app.shop.ultimateBookOfRecipesPrice), "$5.34");
		assertEquals(app.shop.checkThePriceOfStorm(app.shop.stormPrice), "$80.20");
		
	    double priceUltimateBook = 5.34;
	    double priceStorm = 80.30;

	    String result = (priceUltimateBook < priceStorm) ? "Ultimate Book of Recipes is cheaper" : "Storm is cheaper";
	    System.out.println(result);
	    
	    //Personal nu sunt foarte impacat cu solutia de mai sus dar nu inteleg cum pot sa extrag preturile de pe site ca double
	    //ca apoi sa le pot compara matematic.
	}
}