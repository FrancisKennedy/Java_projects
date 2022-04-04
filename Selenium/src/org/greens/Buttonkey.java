package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonkey {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\franciskenny\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
	//1.get the x & y position
		WebElement getPositionBotton = driver.findElement(By.id("position"));
		Point xyPoint=getPositionBotton.getLocation();
	    int xvalue=	xyPoint.getX();
	    int yvalue=	xyPoint.getY();
		System.out.println("xvalue is : "+xvalue+" yvalue is :"+yvalue);
	//2.find the color
		WebElement getColorButton= driver.findElement(By.id("color"));
		String color= getColorButton.getCssValue("background-color");
		System.out.println("button color is : "+ color);
	//3.find the height and width
		WebElement sizeButton = driver.findElement(By.id("size"));
		int Height = sizeButton.getSize().getHeight();
		int Width  = sizeButton.getSize().getWidth();
		System.out.println("Height is :"+Height+'\n'+" Width is : "+Width);
	//4.click button
		WebElement clickbutton = driver.findElement(By.id("home"));
		clickbutton.click();
		
	}

}
