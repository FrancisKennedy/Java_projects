package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement destination = driver.findElement(By.id("bank"));
		Actions action = new  Actions(driver);
		action.dragAndDrop(source, destination).perform();
		
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination2 = driver.findElement(By.id("amt7"));
		Actions action2 = new Actions(driver);
		action2.dragAndDrop(source2, destination2).perform();
		
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement destination3= driver.findElement(By.id("loan"));
		Actions action3 = new Actions(driver);
		action3.dragAndDrop(source3, destination3).perform();
		
		WebElement source4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination4 = driver.findElement(By.id("amt8"));
		Actions action4 = new Actions(driver);
		action4.dragAndDrop(source4, destination4).perform();
		
	}

}
