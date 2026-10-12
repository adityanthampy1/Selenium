package UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(500);
		WebElement upload=driver.findElement(By.id("file-upload"));
		upload.sendKeys("C:\\Users\\Adityan\\Downloads\\Automation Testing.pdf");
		Thread.sleep(500);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
