package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement amazonLogo = driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
		String s = amazonLogo.getAttribute("id");
		System.out.println(s);
		System.out.println(amazonLogo.getAttribute("href"));
		System.out.println(amazonLogo.getAttribute("aria-label"));
		
		WebElement cart = driver.findElement(By.xpath("//a[@id='nav-cart']"));
		System.out.println(cart.getAttribute("href"));
		System.out.println(cart.getAttribute("id"));
		int a = cart.getLocation().x;
		System.out.println(a);
		int b = cart.getLocation().y;
		System.out.println(b);
		
	}

}
