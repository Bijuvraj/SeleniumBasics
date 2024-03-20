package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\EdgeDriver\\msedgedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in"); //get url
		driver.manage().window().maximize(); //maximize the window
		//driver.getTitle();
		String str=driver.getTitle(); // show title name
		System.out.println(str);
		//System.out.println(driver.getCurrentUrl());
		String s = driver.getCurrentUrl(); //get current url name
		System.out.println(s);
		//driver.quit(); // close the browser
		//driver.close();// close the current tab only
	}

}
