package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedtext1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement forgotPassword = driver.findElement(By.linkText("End of season sale"));
		forgotPassword.click();
		//WebElement amazonbussinessregister = driver.findElement(By.partialLinkText("Register"));
		//amazonbussinessregister.click();
	}

}
