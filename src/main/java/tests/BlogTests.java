package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
		
		assertEquals(app.blog.checkCategoryText(app.blog.categoryClassic), "Classic");
		assertEquals(app.blog.checkCategoryText(app.blog.categoryNews), "News");
		assertEquals(app.blog.checkCategoryText(app.blog.categoryRecommend), "Recommend");
	}
	
	/*@Test(priority=2)
	public void shopTest() {
		
		app.click(app.menu.shopLink);
		app.click(app.shop.cookbooksLink);
		
		assertEquals(app.shop.checkIfAHundredAndOneRecepiesBookIsOnSale(app.shop.aHundredAndOneRecepiesBook), "SALE!");
		assertEquals(app.shop.checkIfCookingWithLoveBookIsOnSale(app.shop.cookingWithLoveBook), "SALE!");
		assertEquals(app.shop.checkIfHealthyLifestyleBookIsOnSale(app.shop.healthyLifestyleBook), "SALE!");
		assertEquals(app.shop.checkIfTheVeganCookeryBookIsOnSale(app.shop.theVeganCookeryBook), "");
		assertEquals(app.shop.checkIfUltimateBookOfRecipesBookIsOnSale(app.shop.ultimateBookOfRecipesBook), "SALE!");
	}
	
	    La testul cu bulina de SALE nu este ok. Pentru ca ai asertat ca unul nu contine.
		Testul ala trebuie sa aserteze 5 carti si sa pice, pentru ca o carte nu are bulina.
		La fel si aici, ai duplicat o metoda.
		Iti trebuia o singura metoda de fapt 😊
 

		Exemplu:

		Fac 2 locatori, pentru carti (asta gaseste 5 carti) si pentru bulina de Sale (asta gaseste 4)

     public By cookBooks = By.cssSelector("div[class='post_thumb']");
     public By saleMark = By.cssSelector("span[class='onsale']");
 

		Fac o metoda care intoarce nr de elemente gasite

     public int returnNrOfElements(By locator) { 
          List<WebElement> elements = driver.findElements(locator);
          return elements.size();
     }

 

		In metoda de test assertez ca a gasit atatea buline care carti sunt 😊

     @Test(priority=2)
     public void shopTest() {

          app.click(app.menu.shopLink);
          app.click(app.shop.cookbooksLink);

          assertTrue(app.shop.returnNrOfElements
                   (app.shop.cookBooks) == app.shop.returnNrOfElements(app.shop.saleMark) ? true : false);
     }
	 */
    @Test(priority=2)
    public void shopTest() {

         app.click(app.menu.shopLink);
         app.click(app.shop.cookbooksLink);

         assertTrue(app.shop.returnNrOfElements
                  (app.shop.cookBooks) == app.shop.returnNrOfElements(app.shop.saleMark) ? true : false);
    }
	
}