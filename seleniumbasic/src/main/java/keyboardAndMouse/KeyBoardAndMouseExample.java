package keyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAndMouseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://the-internet.herokuapp.com/key_presses");
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		//searchfield.sendKeys("smart watch"+Keys.ENTER);
		//searchfield.sendKeys("iphone");
		//searchfield.sendKeys(Keys.BACK_SPACE);
		//searchfield.sendKeys(Keys.chord(Keys.CONTROL,"A"));
		//searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.BACK_SPACE);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.SHIFT);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ENTER);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.SPACE);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ESCAPE);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ALT);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.SEMICOLON);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ARROW_DOWN);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ARROW_LEFT);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ARROW_UP);
		searchfield = driver.findElement(By.xpath("//input[@id='target']"));
		searchfield.sendKeys(Keys.ARROW_RIGHT);
		
	}

}
