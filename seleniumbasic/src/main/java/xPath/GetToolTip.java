package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/social-icon.html");
		WebElement eMail = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		System.out.println(eMail.getAttribute("title"));
		WebElement youTube = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
		System.out.println(youTube.getAttribute("title"));
	}

}
