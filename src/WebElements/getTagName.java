package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		Thread.sleep(500);
		WebElement element=driver.findElement(By.id("first-name"));
		System.out.println("TAG NAME: "+element.getTagName());
		Thread.sleep(500);
		driver.quit();
	}

}
