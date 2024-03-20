package xPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\LocalDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement allDropDown = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select select = new Select(allDropDown);
		select.selectByIndex(1);
		select.selectByValue("search-alias=apparel");
		select.selectByValue("search-alias=stripbooks");
		select.selectByVisibleText("Beauty");
		select.selectByVisibleText("Audible Audiobooks");
		List<WebElement> alloptions = select.getOptions();
		int a = alloptions.size();
		System.out.println(a);
		for(WebElement all : alloptions)
		{
			//System.out.println(all);
			System.out.println(all.getText());
		}
	}

}
