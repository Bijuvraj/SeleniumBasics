package practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Apps {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bijuv\\OneDrive\\Desktop\\LocalDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com");
		//WebElement stay = driver.findElement(By.xpath("//button[@jsname='ZUkOIc']"));
		//stay.click();
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchBox.sendKeys("Amazon");
		searchBox.sendKeys(Keys.ENTER);
		driver.navigate().back();
		WebElement signIn = driver.findElement(By.xpath("//a[@class='gb_ua gb_md gb_dd gb_9d']"));
		signIn.click();
		WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
		emailId.sendKeys("bijuvraj97@gmail.com");
		WebElement nextButton = driver.findElement(By.xpath("(//button[@jscontroller='soHxf'])[2]"));
		nextButton.click();
		WebElement tryAgain = driver .findElement(By.xpath("//a[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb']"));
		tryAgain .click();
		WebElement createNewAcc = driver .findElement(By.xpath("//button[@aria-haspopup='menu']"));
		createNewAcc.click();
		WebElement selectForChild = driver .findElement(By.xpath("(//li[@role='menuitem'])[2]"));
		selectForChild.click();
		WebElement yesContinue = driver .findElement(By.xpath("//button[@data-idom-class='nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']"));
		yesContinue .click();
		WebElement enterFirstName = driver .findElement(By.xpath("//input[@aria-label='First name']"));
		enterFirstName.sendKeys("Ben");
		WebElement enterLastName =driver .findElement(By.xpath("//input[@id='lastName']"));
		enterLastName.sendKeys("V");
		WebElement clickNextButton = driver .findElement(By.xpath("//button[@jsname='LgbsSe']"));
		clickNextButton.click();
		
		/*WebElement selectMonth = driver.findElement(By.xpath("(//div[@class='rpKPOd'])[1]"));
		Thread.sleep(3);
		selectMonth.click();
		WebElement enterDate = driver.findElement(By.xpath("(//div[@jscontroller='Fndnac'])[1]"));
		enterDate.sendKeys("01");
		WebElement enterYear = driver.findElement(By.xpath("(//div[@jscontroller='Fndnac'])[2]"));
		enterYear.sendKeys("2024"); */
		WebElement clickNextBut = driver.findElement(By.xpath("//button[@type='button']")); 
		clickNextBut.click();
	}

}
