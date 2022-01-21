package webAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();	
		
		WebElement homePage=driver.findElement(By.id("home"));
		homePage.click();
		
		Set <String> handles=driver.getWindowHandles();
		for (String newWindows : handles) {
			driver.switchTo().window(newWindows);
		}
		WebElement editLink=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/h5"));
		editLink.click();
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement noofWindows=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		noofWindows.click();
		
		

	}

}
