package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFormLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/form");
		WebElement h1Text = driver.findElement(By.xpath("//h1[contains(text(),'Complete Web Form')]"));
		System.out.println(h1Text.getText());
		WebElement firstNameLabel = driver.findElement(By.xpath("//label[contains(text(),'First name')]"));
		System.out.println(firstNameLabel.getText());
	}

}
