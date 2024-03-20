package keyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		WebElement searchfield = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(searchfield).build().perform();
		Thread.sleep(3000);
		actions.release(searchfield).build().perform();
		actions.sendKeys(searchfield, "Fan").build().perform();
		actions.keyDown(searchfield, Keys.BACK_SPACE).build().perform();
	}

}
