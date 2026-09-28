package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("TOTAL LINKS: "+links.size());
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		driver.quit();
		

	}

}
