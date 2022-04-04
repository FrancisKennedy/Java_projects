package org.greens;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement dropdown = driver.findElement(By.id("fruits"));
	 	Select s = new Select(dropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Grape");
		Thread.sleep(2000);
	    java.util.List<WebElement> Option = s.getOptions();
	    int i =1;
		for (WebElement e : Option) {
			String text = e.getText();
			System.out.println(i+"."+text);
			i++;
			
		}
		System.out.println("Total number of Fruits : "+Option.size());
		driver.close();
	}

}

