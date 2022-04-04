package org.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\"
				+ "eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		WebElement username = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		username.sendKeys("francis");
		WebElement continueButton = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		continueButton.click();
		
	}

}
