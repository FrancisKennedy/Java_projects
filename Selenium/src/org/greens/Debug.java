package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("//a[(text()='Login')]"));
		Thread.sleep(3000);
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create an account')]"));
		createAccount.click();
		
		
	}

}
