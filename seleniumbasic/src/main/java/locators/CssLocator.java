package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement searchfield = driver.findElement(By.cssSelector("#twotabsearchtextbox")); 
		//searchfield.sendKeys("iphone14");
		//searchfield.clear();
		//searchfield.sendKeys("smart watch");
		//WebElement searchbutton = driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute")); // 1 of 1 class name only
		//searchbutton.click();
		WebElement alldropdown = driver.findElement(By.tagName("select"));
		alldropdown.click();
	}

}
