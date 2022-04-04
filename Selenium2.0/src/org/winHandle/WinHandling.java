		package org.winHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\eclipse-workspace\\Selenium2.0\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 12");
		WebElement clickbutton = driver.findElement(By.id("nav-search-submit-button"));
		clickbutton.click();
		WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Blue']"));
		iphone.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();			
		System.out.println(child);
		for (String bothwindow : child) {
			if (!parent.equals(bothwindow)) {
				driver.switchTo().window(bothwindow);
			}
			
		}
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement closeX = driver.findElement(By.id("attach-close_sideSheet-link"));
		closeX.click();
		
		WebElement color = driver.findElement(By.xpath("//img[@alt='Green']"));
		color.click();
		
		WebElement addtocart2 = driver.findElement(By.id("add-to-cart-button"));
		addtocart2.click();
//		WebElement addtocart2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
//		addtocart2.click();
		
	}
	

}
