package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class getAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver);

		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		Thread.sleep(500);
		action.sendKeys(Keys.HOME).perform();

		WebElement element=driver.findElement(By.xpath("//span[text()='Tutorials']"));
		System.out.println("ATTRIBUTE: "+element.getAttribute("class"));
		driver.quit();
	}

}
