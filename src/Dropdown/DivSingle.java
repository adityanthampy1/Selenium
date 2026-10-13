package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DivSingle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(500);
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]"));
		dropdown.click();
		driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
