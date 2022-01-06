package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinktextExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		driver.findElement(By.partialLinkText("Edit")).click();
		

	}

}
