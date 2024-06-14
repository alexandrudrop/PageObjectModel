package tests.tema;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
	    double priceStorm = 80.20;

	    String result = (priceUltimateBook < priceStorm) ? "Ultimate Book of Recipes is cheaper" : "Storm is cheaper";
	    System.out.println(result);
	    
	    //Personal nu sunt foarte impacat cu solutia de mai sus dar nu inteleg cum pot sa extrag preturile de pe site ca double
	    //ca apoi sa le pot compara matematic.
	    
	    //mai jos raspunsul lui Dragos:
	    /*
	     * Tu ai asa:
	     * Metoda care iti scoate textul (deci return type-ul va fi string)
	     * app.shop.checkThePriceOfUltimateBookOfRecipes(app.shop.ultimateBookOfRecipesPrice)
	     * asta iti scoate “$5.34”
	     * Acum trebuie sa scapi de caracterul $
	     * Asa ca folosesti substring si ii dai indexul de unde vrei sa inceapa string-ul tau
	     * String:  $5.34
	     * Index:   01234
	     * Asa ca vei avea :
	     * app.shop.checkThePriceOfUltimateBookOfRecipes(app.shop.ultimateBookOfRecipesPrice).substring(1)
	     * ca sa incepi de la cifra 5
	     * asta iti returneaza  5.34  Doar ca este tot text. Tu vrei Double.
	     * Asa ca folosesti  Double.parseDouble (string) care transforma un string in Double
	     */
	    
	    double priceUltimateBook1 =  Double.parseDouble(app.shop.checkThePriceOfUltimateBookOfRecipes(app.shop.ultimateBookOfRecipesPrice).substring(1));
	    double priceStorm1 = Double.parseDouble(app.shop.checkThePriceOfStorm(app.shop.stormPrice).substring(1));
	    assertTrue((priceUltimateBook1 < priceStorm1) ? true : false);
	}
}