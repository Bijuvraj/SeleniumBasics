package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/checkbox");
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='checkbox-3']"));
		checkBox3.isSelected();
		boolean checkBox3Status = checkBox3.isSelected();
		System.out.println(checkBox3Status);
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='checkbox-2']"));
		checkBox2.isSelected();
		boolean checkBox2Status = checkBox2.isSelected();
		System.out.println(checkBox2Status);
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		checkBox1.isSelected();
		boolean checkBox1Status = checkBox1.isSelected();
		System.out.println(checkBox1Status);
		if(checkBox3Status == false)
		{
			checkBox3.click();
		}
		if(checkBox2Status == false)
		{
			checkBox2.click();
		}
		
		if(!checkBox1Status)
		{
			checkBox1.click();
		}
		System.out.println(checkBox3.isSelected());
		System.out.println(checkBox2.isSelected());
		System.out.println(checkBox1.isSelected());
		System.out.println(checkBox1.isDisplayed());
		System.out.println(checkBox2.isDisplayed());
		System.out.println(checkBox3.isDisplayed());
	}

}
