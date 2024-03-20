package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		Thread.sleep(2000);
		WebElement popUp = driver.findElement(By.xpath("//h3[text()='This is a modal window']"));
		System.out.println(popUp.getText()); 
		WebElement popUpclose = driver.findElement(By.xpath("//p[text()='Close']"));
		popUpclose.click();
		
	}

}
