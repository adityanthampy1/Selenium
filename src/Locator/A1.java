package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ADI");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("adi@mail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("MUMBAI");
		Thread.sleep(500);
		Actions action = new Actions(driver);

        // Scroll down using keyboard
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(500);
		driver.close();
		

	}

}
