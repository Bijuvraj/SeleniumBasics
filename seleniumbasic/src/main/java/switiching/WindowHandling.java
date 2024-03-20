package switiching;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		
		String parentwindow = driver.getWindowHandle(); //get current window id 
		System.out.println(parentwindow);
		Set<String> windows=driver.getWindowHandles(); //get id of all windows
		System.out.println(windows.size());
		System.out.println(driver.getTitle());
		for(String currentWindow : windows)
		{
			if (!parentwindow.equals(currentWindow))
			{
				driver.switchTo().window(currentWindow);
			}
		}
		System.out.println(driver.getTitle());
		
	}

}
