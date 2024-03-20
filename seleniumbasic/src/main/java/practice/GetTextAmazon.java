package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement productLable = driver.findElement(By.xpath("//span[text()='Clothing']"));
		productLable.click();
		//driver.navigate().to("https://www.amazon.in/b?node=1968024031");
		WebElement checkBoxPremiumBrands = driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label']//span[contains(text(),'Premium Brands')]"));
		checkBoxPremiumBrands.click();
		/*productLable.getText();
		String buttonLabel = productLable.getText();
		System.out.println(buttonLabel); */
		//WebElement textLable = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		//System.out.println(textLable.getText());
	}
	}


