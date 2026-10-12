package UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(500);
		WebElement upload=driver.findElement(By.name("uploadfile_0"));
		upload.sendKeys("C:\\Users\\Adityan\\Downloads\\Automation Testing.pdf");
		Thread.sleep(500);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(500);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
