package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(500);
		
		WebElement dropdown=driver.findElement(By.id("multiple-select-example"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Apple");
		select.selectByIndex(1);
		select.selectByValue("peach");
		Thread.sleep(2000);
		select.deselectByIndex(1);
		select.deselectAll();
		Thread.sleep(2000);
		driver.quit();

	}

}
