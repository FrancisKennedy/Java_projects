package org.action;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.name("username"));
		username.click();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_Y);
		
	}
	
	

}
