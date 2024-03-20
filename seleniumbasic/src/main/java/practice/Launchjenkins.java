package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchjenkins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/login?from=%2F");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("j_username"));
		userName.sendKeys("Bijuvraj");
		WebElement password = driver .findElement(By.id("j_password"));
		password.sendKeys("jhjhggiyguy");
		WebElement loginbutton = driver.findElement(By.name("Submit"));
		loginbutton.click();
	}

}
