package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/hovers");
		WebElement firstprofile = driver.findElement(By.xpath("(//div[@class='figure']//img[@src='/img/avatar-blank.jpg'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstprofile).build().perform();
		
		WebElement firstprofileName = driver.findElement(By.xpath("//div[@class='figcaption']//h5[text()='name: user1']"));
		System.out.println(firstprofileName.getText());
	}

}
