package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
	WebElement email= driver.findElement(By.id("email"));
			email.sendKeys("keny@gmail.com");
		WebElement appendbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		
		appendbox.clear();
		appendbox.sendKeys("anything");
		WebElement gettextbox= driver.findElement(By.name("username"));
		String value = gettextbox.getAttribute("value");
		System.out.println(value);
		WebElement clearbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		WebElement disablebox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disablebox.isEnabled();
		System.out.println(enabled);
	}
	

}
