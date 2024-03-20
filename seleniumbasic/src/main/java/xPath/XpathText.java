package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		//WebElement clickforgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//clickforgot.click();
		WebElement createpage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		createpage.click();
	}

}
