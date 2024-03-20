package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMessagePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		WebElement userNameInput = driver.findElement(By.xpath("//input[@name='username']"));
		System.out.println(userNameInput.isEnabled());
		userNameInput.sendKeys("usr");
		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
		System.out.println(passwordInput.isEnabled());
		passwordInput.sendKeys("pwd");
		WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		logInButton.click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='flash error']"));
		System.out.println(errorMsg.getText());
		System.out.println(errorMsg.getCssValue("color"));
		
	}

}
