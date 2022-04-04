package org.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAction {
	
	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a = new Actions(driver);
		a.contextClick(gmail).perform();
		
		Robot robo = new Robot();
		for (int i = 0; i < 3; i++) {
		
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
		}
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}

}
