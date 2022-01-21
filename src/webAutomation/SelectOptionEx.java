package webAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectOptionEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dcc\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectOption=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int getsize=selectOption.size();
		System.out.println(getsize);
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectOption.get(0))
		.click(selectOption.get(1)).build().perform();
		

	}

}
