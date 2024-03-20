package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/radiobutton");
		WebElement radioButtonLable1 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 1')]"));
		radioButtonLable1.getText();
		String buttonLabel = radioButtonLable1.getText();
		System.out.println(buttonLabel);
		WebElement radioButtonLable2 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 2')]"));
		System.out.println(radioButtonLable2.getText());
		WebElement radioButtonLable3 = driver.findElement(By.xpath("//label[contains(text(),'Radio button 3')]"));
		System.out.println(radioButtonLable3.getText());
		
		
	}
	}


