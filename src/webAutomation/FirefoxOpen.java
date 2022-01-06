package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxOpen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
	//	driver.quit();
		
		driver.findElement(By.name("q")).sendKeys("Nidhi agarwal hd pic"+Keys.ENTER);

	}

}
