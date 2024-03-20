package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/notification_message_rendered");
		WebElement clickHere = driver.findElement(By.xpath("//a[@href='/notification_message']"));
		clickHere.sendKeys(Keys.ENTER);
		clickHere = driver.findElement(By.xpath("//a[@href='/notification_message']"));
		clickHere.sendKeys(Keys.ENTER);
		clickHere = driver.findElement(By.xpath("//div[@class='flash notice']"));
		System.out.println(clickHere.getText());
	}

}
