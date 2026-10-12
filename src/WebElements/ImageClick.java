package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImageClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(500);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(500);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(500);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
