package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String args[]) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bijuv\\\\OneDrive\\\\Desktop\\\\LocalDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.amazon.in/");
		//WebElement aboutUs = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
		//Robot scroll = new Robot();
		//scroll.keyPress(KeyEvent.VK_DOWN);
		//js.executeScript("arguments[0].scrollIntoView();",aboutUs);
		WebElement allDropDown = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		//allDropDown.click();
		Select dropDown = new Select(allDropDown);
		dropDown.selectByIndex(14);
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("Sandisk",Keys.ENTER);
		WebElement sandiskPendrive = driver.findElement(By.xpath("//span[contains(text(),'SanDisk Ultra 128GB microSDXC UHS-I, 140MB/s R, memory card, 10 Y Warranty, for Smartphones')]"));
		sandiskPendrive.click();
		//Robot scroll = new Robot();
		//scroll.keyPress(KeyEvent.VK_DOWN);
		WebElement buyNowButton = driver.findElement(By.xpath("(//span[@class='a-button-inner'])[9]"));
		//buyNowButton.sendKeys(Keys.ARROW_DOWN);
		//buyNowButton.click();
		Actions action = new Actions(driver);
		action.moveToElement(buyNowButton).build().perform();
	
		//js.executeScript("arguments[0].scrollIntoView();",aboutUs);
		
		//js.executeScript("arguments[0].click();",buyNowButton);

	}

}
