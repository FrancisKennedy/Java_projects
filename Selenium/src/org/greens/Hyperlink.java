package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyperlink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdownbox1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdownbox1);
		select.selectByIndex(2);
		
		WebElement dropdownbox2 = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(dropdownbox2);
		 select1.selectByVisibleText("Loadrunner");


	}

}
