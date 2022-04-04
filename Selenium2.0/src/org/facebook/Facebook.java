package org.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Timeout;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\eclipse-workspace\\Selenium2.0\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("franikeny1395@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Fk@12345");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		WebElement selectAccout = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		selectAccout.click();
		WebElement logOut = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logOut.click();
		
		
}
}
