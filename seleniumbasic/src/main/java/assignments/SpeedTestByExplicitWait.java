package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpeedTestByExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.navigate().to("https://fast.com/");
		WebElement speedTest = driver.findElement(By.xpath("//div[@id='your-speed-message']"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='your-speed-message']")));
		System.out.println(speedTest.getText());
		
		WebElement speedValue = driver.findElement(By.xpath("//div[@id='speed-value']"));
		System.out.println(speedValue.getText());
		
		WebElement speedUnits = driver.findElement(By.xpath("//div[@id='speed-units']"));
		System.out.println(speedUnits.getText());
	}

}
