package switiching;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

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
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext())
		{
			String childwindow = itr.next();
			//System.out.println(itr.next());
			if (!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
		}
		System.out.println(driver.getTitle());
		WebElement newWindow = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println(newWindow.getText());
		driver.close(); //close child window
		
		driver.switchTo().window(parentwindow);
		
	}

}
