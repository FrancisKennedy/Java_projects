package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstNameBox = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		firstNameBox.sendKeys("Francis");
		WebElement lastNameBox = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastNameBox.sendKeys("Kennedy");
		WebElement addressBox = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addressBox.sendKeys("Pallavaram chennai-43"); 	
		WebElement emailBox = driver.findElement(By.xpath("//input[@type='email']"));
		emailBox.sendKeys("testmail@gmail.com");
		WebElement phoneBox = driver.findElement(By.xpath("//input[@type='tel']"));
		phoneBox.sendKeys("82483742");
		WebElement genderButton = driver.findElement(By.name("radiooptions"));
		genderButton.click();
		WebElement hobbies = driver.findElement(By.id("checkbox2"));
		hobbies.click();
		WebElement languageBox = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
		
		
	}

}
