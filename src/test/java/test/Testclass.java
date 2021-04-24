package test;

import org.testng.annotations.Test;

import browser.browser;

public class Testclass {
	
	browser br = new browser();
			
	@Test(priority = 1)	
	
	public void openfacebook() {
		br.Chrome();
	}

}
