package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement enterEmailid = driver.findElement(By.id("email")); 
		enterEmailid.click();
		enterEmailid.sendKeys("Biju");
		//enterEmailid.clear();
		WebElement enterpassword = driver.findElement(By.name("pass"));
		enterpassword.sendKeys("Biju");
		//System.out.println(driver.getTitle());
		WebElement loginButton = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		loginButton.click();
	}

}
