package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PE2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String title=driver.getTitle();
		System.out.println(title);
		String curenturl=driver.getCurrentUrl();
		System.out.println(curenturl);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.close();

	}

}
