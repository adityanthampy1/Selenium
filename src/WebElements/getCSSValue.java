package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training/");
		WebElement CSS=driver.findElement(By.xpath("//a[@class='navbar__brand col-auto order-0']"));
		System.out.println("COLOR: "+CSS.getCssValue("COLOR"));
		System.out.println("BACKGROUND COLOR: "+CSS.getCssValue("Background"));
		driver.quit();

	}

}
