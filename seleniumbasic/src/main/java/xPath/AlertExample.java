package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jSAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		WebElement jSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		WebElement jSPromt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jSAlert.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		jSConfirm.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); 
		jSPromt.click();
		driver.switchTo().alert().sendKeys("Biju");
		driver.switchTo().alert().accept();
		
	}

}
