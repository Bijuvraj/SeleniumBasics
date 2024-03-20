package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Option 1']"));
		System.out.println(radioButton1.isSelected());
		WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='Option 2']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radioButton2).build().perform();
		actions.click().build().perform();
		System.out.println(radioButton2.isSelected());
		WebElement radioButton3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
		System.out.println(radioButton3.isSelected());
		
		WebElement clickCheckBox1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		System.out.println(clickCheckBox1.isSelected());
		WebElement clickCheckBox2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
		System.out.println(clickCheckBox2.isSelected());
		WebElement clickCheckBox3 = driver.findElement(By.xpath("//input[@value='checkbox3']"));
		actions.click(clickCheckBox3).build().perform();
		System.out.println(clickCheckBox3.isSelected());
		
	}

}
