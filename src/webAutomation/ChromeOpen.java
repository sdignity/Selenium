package webAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpen {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.quit();
		

	}

}
