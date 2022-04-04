package org.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//Select using index
		driver.manage().window().maximize();
		WebElement dropdownBox = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdownBox);
		select.selectByIndex(1);
		//select using value
		WebElement dropdownBox2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdownBox2);
		select2.selectByValue("2");
		//select using text
		WebElement dropdownBox3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdownBox3);
		select3.selectByVisibleText("Loadrunner");
		//number of dropdown4 option
		WebElement dropdownBox4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select select4 = new Select(dropdownBox4);
		List<WebElement> listoption = select4.getOptions();
		int size = listoption.size();
		System.out.println("Number of size is :" + size);
		//Using sendkey	
		WebElement dorpdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dorpdown5.sendKeys("UFT/QTP");
		//selectbox1
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectBox = new Select(multiselect);
		multiselectBox.selectByIndex(1);
		multiselectBox.selectByIndex(2);
		multiselectBox.selectByIndex(3);
		
	}
}
