package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/buttons");
		//WebElement dropDownButton = driver.findElement(By.xpath("//div[@class='btn-group']//button[@id='btnGroupDrop1']"));
		//dropDownButton.click();
		WebElement dropDownButton = driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]"));
		dropDownButton.click();
		//WebElement warningButton = driver.findElement(By.xpath("//div[@class='col-sm-8']//button[@class='btn btn-lg btn-warning']"));
		//warningButton.click();
		WebElement warningButton = driver.findElement(By.xpath("//button[contains(text(),'Warning')]"));
		warningButton.click();
	}

}
