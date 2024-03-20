package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/");
		WebElement radioButton = driver.findElement(By.xpath("//div[@class='jumbotron-fluid']//a[@href='/radiobutton']"));
		radioButton.click();
		driver.navigate().to("https://formy-project.herokuapp.com/radiobutton");
		WebElement radioButton2 = driver.findElement(By.xpath("//div[@class='container']//div[@class='form-check']//input[@value='option2']"));
		radioButton2.click();
		driver.navigate().to("https://formy-project.herokuapp.com/radiobutton");
		WebElement radioButton1 = driver.findElement(By.xpath("//div[@class='container']//div[@class='form-check']//input[@value='option1']"));
		radioButton1.click();
	}
	}


