package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		String curenturl=driver.getCurrentUrl();
		System.out.println(curenturl);
		Thread.sleep(5000);
		driver.quit();

	}
 
}
