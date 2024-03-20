package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/ajax.html");
		WebElement resetButton = driver.findElement(By.xpath("//input[@ value='Reset']"));
		System.out.println(resetButton.getAttribute("value"));
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='yes']"));
		System.out.println(radioButton.getAttribute("type"));
		
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@id='yes']"));
		System.out.println(radioButton1.isEnabled());
		
		WebElement radioButton2 = driver.findElement(By.xpath("//input[@id='no']"));
		System.out.println(radioButton2.isEnabled());
	}

}
