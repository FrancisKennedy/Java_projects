package org.radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\"
				+ "eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement ProLang = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		ProLang.click();
		WebElement confirmSelected = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		boolean selected = confirmSelected.isSelected();
		System.out.println(selected);
		WebElement NotSelected = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if (NotSelected.isSelected()) {
			NotSelected.click();
		}
		WebElement SelectedBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if (SelectedBox.isSelected()) {
			SelectedBox.click();
		}
		WebElement checkAllBox1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		checkAllBox1.click();
		WebElement checkAllBox2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		checkAllBox2.click();
		WebElement checkAllBox3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
		checkAllBox3.click();
		WebElement checkAllBox4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input"));
		checkAllBox4.click();
		WebElement checkAllBox5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input"));
		checkAllBox5.click();
	}

}
