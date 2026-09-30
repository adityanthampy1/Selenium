package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.findElement(By.id("enabled-button")).click();
		WebElement dis=driver.findElement(By.id("enabled-example-input"));
		System.out.println("DISPLAY STATUS: "+dis.isEnabled());
		dis.sendKeys("ADI");
		Thread.sleep(2000);
		dis.clear();
		
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(2000);
		dis.click();
		System.out.println("DISPLAY STATUS: "+dis.isEnabled());
		
		driver.findElement(By.id("enabled-example-input")).click();
		dis.sendKeys("AP");
		Thread.sleep(2000);
		System.out.println("DISPLAY STATUS: "+dis.isEnabled());
		driver.close();
		
		
		

	}

}
