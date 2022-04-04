package org.baseclass;

import org.openqa.selenium.WebElement;

public class BaseExecuteMethods extends BaseMethods {
	
	public static void main(String[] args) throws InterruptedException  {
		browserlaunch("https://www.facebook.com/");
		
		maximize();
		downkey(findElementByid("email"), "fran");
	}

}
