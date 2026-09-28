package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_")).sendKeys("ADI");
		Thread.sleep(5000);
		driver.close();
		

	}

}
