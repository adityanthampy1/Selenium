package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PE4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		String title=driver.getTitle();
		System.out.println(title);
		String curenturl=driver.getCurrentUrl();
		System.out.println(curenturl);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(5000);
		driver.close();

	}

}
