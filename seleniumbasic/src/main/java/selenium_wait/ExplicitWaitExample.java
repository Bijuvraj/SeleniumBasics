package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
		WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
		wait.until(ExpectedConditions.elementToBeClickable(removeButton));
		removeButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Remove')]")));
		WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
		String a=message.getText();
		System.out.println(a);
		
	}

}
