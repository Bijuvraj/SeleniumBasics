package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetisEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/enabled");
		WebElement inputheredisapbled = driver.findElement(By.xpath("//input[@id='disabledInput']"));
		inputheredisapbled.isEnabled();
		System.out.println(inputheredisapbled.isEnabled());
		WebElement inputhere = driver.findElement(By.xpath("//input[@id='input']"));
		inputhere.isEnabled();
		System.out.println(inputhere.isEnabled());
		int x =inputhere.getLocation().x;
		System.out.println(x);
		int y =inputheredisapbled.getLocation().y;
		System.out.println(y);
		
	}

}
