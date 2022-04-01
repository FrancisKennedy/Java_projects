package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.jsoup.safety.Cleaner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {
	static WebDriver driver;
	//static	Actions a = new Actions(driver);
	
	public  static String browserlaunch(String url) {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		return url;
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static WebElement  findElementByid(String id) {
		WebElement elementID = driver.findElement(By.id(id));
		return elementID;
	}
	public static WebElement findElementByname(String name) {
		WebElement elementName = driver.findElement(By.name(name));
		return elementName;
	}
	public static WebElement findElementByXpath(String xpath) {
		WebElement elementXpath = driver.findElement(By.xpath(xpath));
		return elementXpath;
	}
	public static String sendvalues(WebElement element , String keys ) {
		element.sendKeys(keys);
		return keys;
	}
	public static  void clickButton(WebElement clickkey) {
		clickkey.click();
	}
	public static void clearbox (WebElement cleardata) {
		cleardata.clear();
	}
	public static void threadtime(long ln) throws InterruptedException {
		Thread.sleep(ln);
	}
	public static void navigate() {
		Navigation navigate = driver.navigate();
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public static void moveover(WebElement get) {
		Actions a = new Actions(driver);
		a.moveToElement(get).perform();
	}
	public static WebElement dragNdrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		return target;
	}
	public static void rightclick(WebElement selecttext) {
		Actions a = new Actions(driver);
		a.contextClick(selecttext).perform();	
	}
	public static void doubleclick(WebElement clickitem) {
		Actions a = new Actions(driver);
		a.doubleClick(clickitem).perform();
	}	
	public static void downkey(WebElement elementkey, String key) {
		Actions a = new Actions(driver);
		
		a.keyDown(elementkey, key).sendKeys(null);
	}
	public static void upKey(WebElement upkey,String key) {
		Actions a = new Actions(driver);
		a.keyUp(upkey, key);
	} 	
	public Select select(WebElement element) {
		Select select = new Select(element);	
		return select;
	}
	public static void selectbyValue(WebElement element,String value ) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public static void selectbyindex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);		
	}
	public static void selectbytext(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectValue(WebElement element,String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public String deselectText(WebElement element,String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);	
		return text;
	}
	public int deselectIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
		return index;
	}
	public void firstselect(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();

	}
	
	public void getAllselect(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
	}
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	public String getoptions(WebElement element,String name) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement webE : options) {
			String attribute = webE.getAttribute(name);		
		}
		return name;
	}
	
	
	
//	public void scrolling(WebElement pointlocation) {
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		//j.executeScript(key, args);
//	}

}
