package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back(); // go back the previous
		//driver.navigate().forward(); // go to forward
		//driver.navigate().refresh(); // refresh the tab
		driver.get(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//String s =driver.getPageSource();
		//System.out.println(s);
		//driver.close();
		//driver.quit();
	}

}
