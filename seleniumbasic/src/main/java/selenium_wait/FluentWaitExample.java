package selenium_wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello Worldd!']")));
		WebElement heloworld = driver.findElement(By.xpath("//h4[text()='Hello Worlds!']"));
		System.out.println(heloworld.getText());
	}

}
