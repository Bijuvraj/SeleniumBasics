package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement enterEmailid = driver.findElement(By.xpath("//input[@id='email']"));
		enterEmailid.sendKeys("biju@gmail.com");
		WebElement enterPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		enterPassword.sendKeys("123456");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();
	}

}
