package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/buttons");
		WebElement allButtons = driver.findElement(By.xpath("//div[@class='col-sm-8']//button"));
		
		List<WebElement> menuElements = driver.findElements(By.xpath("//div[@class='col-sm-8']//button"));
		for(WebElement allButton : menuElements)
		{
			System.out.println(allButton.getCssValue("color"));
			System.out.println(allButton.getText());
		}
		
	}

}
