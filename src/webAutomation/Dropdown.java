package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select option=new Select(dropdown1);
		option.selectByIndex(2);
		option.selectByValue("3");
		option.selectByVisibleText("Loadrunner");
		
		
	}

}
