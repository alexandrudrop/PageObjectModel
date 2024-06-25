package testdata.utils;

import org.testng.annotations.DataProvider;

public class DataProviderRomansClass {
	
	@DataProvider
	public Object [][] booksLinkAndCategoryProvider(){
		Object[][] data = new Object[4][2];
		
		data[0][0] = "a-banquet-of-mouse";
		data[0][1] = "Romans";
		
		data[1][0] = "life-in-the-garden";
		data[1][1] = "Romans";
		
		data[2][0] = "lonely-man-in-white-hat";
		data[2][1] = "Romans";
		
		data[3][0] = "the-son";
		data[3][1] = "Romans";
		
		return data;
	}

}
