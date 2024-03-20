package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		WebElement clickremember = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		clickremember.click();
		WebElement getremember = driver.findElement(By.xpath("//tagName[text()='visible']"));
		getremember.click();
	}
	}


