package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://formy-project.herokuapp.com/switch-window");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement openNewWindow = driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		openNewWindow.click();
		
		String parentwindow = driver.getWindowHandle(); //get current window id 
		System.out.println(parentwindow);
		Set<String> windows=driver.getWindowHandles(); //get id of all windows
		for(String currentWindow : windows)
		{
			if (!parentwindow.equals(currentWindow))
			{
				driver.switchTo().window(currentWindow);
			}
		}
		
		System.out.println(driver.getTitle());
		WebElement NewWindow = driver.findElement(By.xpath("//h1[text()='Welcome to Formy']"));
		System.out.println(NewWindow.getText());
		driver.close();
		
		driver.switchTo().window(parentwindow);
	}

}
