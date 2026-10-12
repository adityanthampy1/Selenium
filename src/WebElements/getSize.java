package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training/");
		WebElement element=driver.findElement(By.xpath("//div[@class='col-12 col-lg-6 order-lg-0 d-flex flex-column justify-content-md-center']"));
		System.out.println("SIZE: "+element.getSize());
		driver.quit();
	}

}
