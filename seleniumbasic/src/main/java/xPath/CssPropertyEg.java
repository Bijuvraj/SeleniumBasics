package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPropertyEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.keralartc.com/");
		WebElement bookNowButton = driver.findElement(By.xpath("//a[text()='Book Now']"));
		System.out.println(bookNowButton.getCssValue("background-color"));
		System.out.println(bookNowButton.getCssValue("color"));
		System.out.println(bookNowButton.getCssValue("font-style"));
		System.out.println(bookNowButton.getCssValue("font-size"));
	}

}
