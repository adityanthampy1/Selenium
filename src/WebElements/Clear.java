package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement name=driver.findElement(By.id("email"));
		name.sendKeys("ADI");
		Thread.sleep(5000);
		name.clear();
		Thread.sleep(5000);
		driver.close();
	}

}
