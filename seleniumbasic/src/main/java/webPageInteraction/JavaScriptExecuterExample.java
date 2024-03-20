package webPageInteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.amazon.in");
		
		//js.executeScript("alert('Welcome ---');");
		//js.executeScript("window.scrollBy(0,800)");   //Scroll
		WebElement uAE = driver.findElement(By.xpath("//a[text()='United Arab Emirates']"));
		js.executeScript("arguments[0].scrollIntoView();",uAE);
		
		js.executeScript("arguments[0].click();",uAE);
		
	}

}
