package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;
	
public class Greentech {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		
		WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		newAccount.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Francis");
		Thread.sleep(2000);
		WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
		surName.sendKeys("Kennedy");
		Thread.sleep(2000);
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailBox.sendKeys("8248374261");
		WebElement passwordBox = driver.findElement(By.id("password_step_input"));
		passwordBox.sendKeys("keny@12345");
		WebElement birthDate = driver.findElement(By.name("birthday_day"));
		Select select = new Select(birthDate);
		select.selectByIndex(12);
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		Select select2 = new Select(birthMonth);
		select2.selectByValue("12");
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		Select select3 = new Select(birthYear);
		select3.selectByVisibleText("1995");
		WebElement genderBox = driver.findElement(By.xpath("//*[@id=\"u_2_5_HE\"]"));
		genderBox.click();
		}
}
 