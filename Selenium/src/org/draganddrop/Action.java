package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement courseAction = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions webAction = new Actions(driver);
		webAction.moveToElement(courseAction).perform();
		WebElement oracleAction = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		Actions webAction2 = new Actions(driver);
		webAction2.moveToElement(oracleAction).perform();
		WebElement oraclesqlAction = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Training']"));
		oraclesqlAction.click();
		
	}

}
