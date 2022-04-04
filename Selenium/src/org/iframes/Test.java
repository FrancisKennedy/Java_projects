package org.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\"
				+ "eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement clickbutton = driver.findElement(By.id("Click"));
		clickbutton.click();
		
		driver.switchTo().frame("frame2");
		WebElement click1 = driver.findElement(By.id("Click1"));
		click1.click();
		
		driver.switchTo().defaultContent();
		WebElement getdata = driver.findElement(By.xpath("//h1[text()='Fun with frames']"));
		String text = getdata.getText();
		System.out.println(text);
		
}
	
}