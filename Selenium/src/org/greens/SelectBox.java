package org.greens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		
		List<WebElement> option = s.getOptions();
		
		int i = 1;
		for (WebElement e : option) {
			System.out.println(i+"."+e.getText());
			i++;
			
			
		}
		System.out.println("The total number of countries : "+option.size() );
		driver.close();
	}

}
