package Dropdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DivMultyDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://demoqa.com/select-menu");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		
		WebElement dropdown=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		dropdown.click();
		driver.findElement(By.xpath("//div[text() = 'Blue']")).click();
		driver.findElement(By.xpath("//div[text() = 'Red']")).click();
		driver.findElement(By.xpath("//div[text() = 'Black']")).click();
		Thread.sleep(500);
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='css-9jq23d']"));
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		driver.quit();
	}

}
