package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']//following:: a[contains(text(),'Forgotten password?')]"));
		//emailid.click();
		//WebElement forgottpassword = driver.findElement(By.xpath("//div[@class='jumbotron-fluid']//a[@href='/radiobutton']"));
		//forgottpassword.click();
		
	}
	}


