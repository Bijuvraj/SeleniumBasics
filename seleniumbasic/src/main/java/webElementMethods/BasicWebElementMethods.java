package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement loginButtonLable = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		loginButtonLable.getText();
		String buttonLabel = loginButtonLable.getText();
		System.out.println(buttonLabel);
		WebElement textLable = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		System.out.println(textLable.getText());
	}
	

}
