package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/accessing-link.html");
		driver.findElement(By.linkText("click here")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(5000);
		System.out.println("PAGE TITLE: "+driver.getTitle());
		driver.quit();

	}

}
