package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\franciskenny\\"
				+ "eclipse-workspace\\Selenium2.0\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("keny");
		WebElement passwd = driver.findElement(By.id("password"));
		passwd.sendKeys("Ken@123");
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D://testscreenshot.png");
		FileUtils.copyFile(screenshotAs, dest);
	}

}
