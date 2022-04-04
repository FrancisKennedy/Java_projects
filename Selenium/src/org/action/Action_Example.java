package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Example {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/search?q=diwali&oq=diwali&aqs=chrome..69i57j0i67l2j0i67i433l3j0i67l3j0i433i457.4202j0j4&sourceid=chrome&ie=UTF-8");
		WebElement diwali = driver.findElement(By.xpath("//img[@jsname='sozv8']"));
		diwali.click();
		Thread.sleep(2000);
		
		WebElement d = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[3]"));
		Actions a = new Actions(driver);
		a.moveToElement(d).perform();
		Thread.sleep(2000);
		
		WebElement d2 = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[4]"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(d2).perform();
		Thread.sleep(2000);
		
		WebElement d3 = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[5]"));
		Actions a3 = new Actions(driver);
		a3.moveToElement(d3).perform();
		Thread.sleep(2000);
		
		WebElement d4 = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[6]"));
		Actions a4 = new Actions(driver);
		a4.moveToElement(d4).perform();
		
		WebElement d5 = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[7]"));
		Actions a5 = new Actions(driver);
		a5.moveToElement(d5).perform();
		
		WebElement d6 = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[8]"));
		Actions a6 = new Actions(driver);
		a6.moveToElement(d6).perform();
		
		WebElement d7= driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[9]"));
		Actions a7 = new Actions(driver);
		a7.moveToElement(d7).perform();
		
		WebElement d8 = driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[1]/img[10]"));
		Actions a8 = new Actions(driver);
		a8.moveToElement(d8).perform();
		Thread.sleep(2000);
	}

}
