package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditField {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
	//	driver.findElement(By.partialLinkText("Edit")).click();
	//	driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Text");
	//	driver.findElement(By.name("username")).sendKeys("acer");
	//	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		
				
		WebElement editBox= driver.findElement(By.partialLinkText("Edit"));
		editBox.click();
		
		WebElement emailBox= driver.findElement(By.id("email"));
		emailBox.sendKeys("abc123@gmail.com");
		
		WebElement appendBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");
		
		WebElement textBox= driver.findElement(By.name("username"));
		textBox.sendKeys("acer");
		
		WebElement clearBox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		
		

	}

}
