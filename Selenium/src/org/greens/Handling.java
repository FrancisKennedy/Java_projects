package org.greens;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\eclipse-workspace\\"
				+ "Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 12",Keys.ENTER);
//		WebElement clickbutton = driver.findElement(By.id("nav-search-submit-button"));
//		clickbutton.click();
		WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (256GB) - Green']"));
		iphone.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String bothwindow : child) {
			if (parent.equals(bothwindow)) {
				driver.switchTo().window(bothwindow);
			}
			
		}
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
	}

}

