package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMove1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		WebElement enabled = driver.findElement(By.xpath("//a[text()='Enabled']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(enabled).build().perform();
		Thread.sleep(2000);
		WebElement downloads = driver.findElement(By.xpath("//li[@id='ui-id-4']//a[text()='Downloads']"));	
		actions.moveToElement(downloads).build().perform();
	}

}
