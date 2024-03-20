package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		
		WebElement heloworld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		System.out.println(heloworld.getText());
	}

}
