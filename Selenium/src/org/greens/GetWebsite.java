package org.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.DownAction;

public class GetWebsite {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\franciskenny\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.xpath("//input[@maxlength='30']"));
		location.sendKeys("pallavaram");
		Actions a = new Actions(driver);
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	

}
