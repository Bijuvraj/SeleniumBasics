package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://formy-project.herokuapp.com/dragdrop");
		WebElement sourceImg = driver.findElement(By.xpath("//div[@id='image']"));
		WebElement destinationBox = driver.findElement(By.xpath("//div[@id='box']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(sourceImg, destinationBox).build().perform();
	}

}
