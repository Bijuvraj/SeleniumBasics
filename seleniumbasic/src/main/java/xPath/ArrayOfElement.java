package xPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		WebElement books = driver.findElement(By.xpath("//ul[@class='top-menu']/li/a"));
		//System.out.println(bookNowButton.getCssValue("background-color"));
		System.out.println(books.getText());
		List<WebElement> menuElements=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		int a = menuElements.size();
		System.out.println(a);
		for(int i = 0;i<menuElements.size();i++)
		{
			System.out.println(menuElements.get(i).getText());
			System.out.println(menuElements.get(i).getTagName());
			System.out.println(menuElements.get(i).getAttribute("href"));
		}
		for(WebElement c:menuElements)
		{
			System.out.println(c.getText());
			System.out.println(c.isSelected());
		}
	}

}
