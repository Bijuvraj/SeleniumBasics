package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDesabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		WebElement remembermeLabel = driver.findElement(By.xpath("//label[@for='RememberMe']"));
		System.out.println(remembermeLabel.getText());
		
		WebElement remembermeCheckBox = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		System.out.println(remembermeCheckBox.isEnabled());
		
		WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/passwordrecovery']"));
		System.out.println(forgotPassword.getText());
		System.out.println(forgotPassword.isEnabled());
	}

}
