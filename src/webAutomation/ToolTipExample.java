package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement toolTipBox=driver.findElement(By.id("age"));
		String tooTipText=toolTipBox.getAttribute("title");
		System.out.println(tooTipText);
		

	}

}
