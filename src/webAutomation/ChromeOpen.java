package webAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpen {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		
		WebElement page1=driver.findElement(By.name("q"));
		page1.sendKeys("Dimple hayathi 4k images"+Keys.ENTER);
		
	//	driver.quit();
		

	}

}
