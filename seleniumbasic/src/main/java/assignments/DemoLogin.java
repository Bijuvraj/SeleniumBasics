package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/login.html");
		
		WebElement eMailEnter = driver.findElement(By.xpath("//input[@data-validate='isEmail']"));
		eMailEnter.sendKeys("adcdef@gmail.com");
		
		WebElement passWordEnter = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passWordEnter.sendKeys("1q2w3e4r");
		
		WebElement clickSignInButton = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		clickSignInButton.click();
		
		WebElement printMessage = driver.findElement(By.xpath("//h3[text()='Successfully Logged in...']"));
		System.out.println(printMessage.getText());
		//System.out.println(printMessage.isEnabled());
	}

}
