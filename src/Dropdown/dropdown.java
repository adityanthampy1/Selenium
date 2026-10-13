package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(500);
		
		WebElement dropdown=driver.findElement(By.id("carselect"));
		dropdown.click();
		Select select=new Select(dropdown);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("honda");
		Thread.sleep(2000);
		select.selectByVisibleText("Benz");
		Thread.sleep(2000);
		driver.quit();
	}

}
