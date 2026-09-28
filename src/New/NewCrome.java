package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCrome {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String title=driver.getTitle();
	System.out.println(title);
	String curentUrl=driver.getCurrentUrl();
	System.out.println(curentUrl);
	Thread.sleep(5000);
	driver.quit();

	}

}
