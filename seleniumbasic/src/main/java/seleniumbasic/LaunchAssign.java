package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com");
		driver.manage().window().maximize();
		driver.get(driver.getCurrentUrl());
		driver.getTitle();
		String s = driver.getTitle();
		System.out.println(s);
		
	}

}
