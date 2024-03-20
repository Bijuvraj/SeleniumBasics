package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		//WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?"));
		//forgotPassword.click();
		WebElement forgotPassword1 = driver.findElement(By.partialLinkText("Forgotten"));
		forgotPassword1.click();
	}

}
