package keyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.amazon.in");
		WebElement searchfield = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		//searchfield.sendKeys("smart watch"+Keys.ENTER);
		searchfield.sendKeys("iphone");
		searchfield.sendKeys(Keys.BACK_SPACE);
		searchfield.sendKeys(Keys.chord(Keys.CONTROL,"A"));
		//searchfield.sendKeys(Keys.BACK_SPACE);
	}

}
