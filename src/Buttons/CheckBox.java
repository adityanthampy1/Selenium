package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(500);
		WebElement CheckBox1=driver.findElement(By.id("hobbies-checkbox-1"));
		Thread.sleep(500);
		CheckBox1.click();
		Thread.sleep(500);
		WebElement CheckBox2=driver.findElement(By.id("hobbies-checkbox-2"));
		Thread.sleep(500);
		CheckBox2.click();
		System.out.println("CheckBox1: "+CheckBox1.isSelected());
		System.out.println("CheckBox2: "+CheckBox2.isSelected());
		driver.quit();
	}

}
