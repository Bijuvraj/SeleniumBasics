package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]")); //if same attribute name in a immediate parent tag
		checkBox1.isSelected();
		boolean checkBox1status = checkBox1.isSelected();
		//boolean checkBox1status = checkBox1.isDisplayed();
		System.out.println(checkBox1status);
		WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		checkBox2.isSelected();
		boolean checkBox2status = checkBox2.isSelected();
		System.out.println(checkBox2status);
		if(checkBox1status == false)
		{
			checkBox1.click();
		}
		
		if(!checkBox2status)
		{
			checkBox2.click();
		}
		System.out.println(checkBox1.isSelected());
		
		System.out.println(checkBox1.isDisplayed());
		System.out.println(checkBox2.isDisplayed());
		System.out.println(checkBox1.isEnabled());
		System.out.println(checkBox2.isEnabled());
	}

}
