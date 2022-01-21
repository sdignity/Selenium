package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement positionButton= driver.findElement(By.id("position"));
		Point xypoint=positionButton.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X value is :"+xvalue+" Y value is :"+yvalue);
		
		WebElement colorButton= driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("Backround color is "+color);
		
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Size of the height :"+height+" Size of the width :"+width);
		
		
		WebElement homepageButton=driver.findElement(By.id("home"));
		homepageButton.click();
		
		
	}

}
