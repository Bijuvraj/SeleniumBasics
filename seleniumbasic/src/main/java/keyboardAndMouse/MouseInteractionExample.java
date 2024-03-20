package keyboardAndMouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		//actions.moveToElement(rightClickMeButton).build().perform();
		//actions.contextClick().build().perform(); //right click any where
		actions.contextClick(rightClickMeButton).build().perform(); //right click on particular webElement
		
		WebElement clickPasteButton = driver.findElement(By.xpath("//span[text()='Paste']"));
		actions.moveToElement(clickPasteButton).build().perform();// otherwise pass the parameter on click();
		actions.click().build().perform(); //click by no parameter
		//actions.click(clickPasteButton).build().perform(); //click button  by using parameter
		driver.switchTo().alert().accept(); //Alert handling Accept
		
		//actions.doubleClick().build().perform();  //Double any where
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(doubleClickButton).build().perform();
		driver.switchTo().alert().accept();
	}

}
