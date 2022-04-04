package org.actionTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Test {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement emailID = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));	
		emailID.sendKeys("selenium@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("test@01234");
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File("F:\\screenshot\\flipkart.png");
		FileUtils.copyFile(src, dest);
		
	}
	
}