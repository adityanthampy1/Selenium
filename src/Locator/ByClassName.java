package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement w=driver.findElement(By.className("inputtext"));
		w.sendKeys("USER");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("9227");
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(500);
		driver.close();

	}

}
